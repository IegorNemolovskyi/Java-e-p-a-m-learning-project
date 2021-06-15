package com.iegor.HW.HW11.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task14 {
    /**
     * Task 14.
     *
     * A sequence of customer information for a supplierList of type Supplier and a sequence of discounts for customers
     * in various stores, supplierDiscountList of type SupplierDiscount is given.
     * Each element of the supplierList sequence includes the fields <customer_ID>, <year_of_birth>, <street_of_residence>.
     * Each element of the supplierDiscountList sequence includes the fields <customer_ID>, <store_name>, <discount_percentage>.
     * Get a list (maxDiscountOwner values) of all stores and for each store find a customer who has the maximum discount in it.
     * If for a certain store there are several customers with the maximum discount, then take the data on the consumer with the minimum code.
     * Sort the list by store names in ascending alphabetical order. For example:
     * input:
     * { Supplier(1, 1993, "Sumskaya") Supplier(2, 1994, "Pushkinskaya") Supplier(3, 1995, "Beketova") Supplier(4, 1996, "Amosova") Supplier(5, 1996, "Amosova")
     *
     * SupplierDiscount(1, 9, "Posad") SupplierDiscount(2, 9, "Posad") SupplierDiscount(3, 10, "Colins") SupplierDiscount(4, 10, "Colins") SupplierDiscount(5, 10, "Denim") }
     * output: { ("Colins", new Supplier(3, 1995, "Beketova")) ("Denim", new Supplier(5, 1996, "Amosova")) ("Posad", new Supplier(1, 1993, "Sumskaya")) }
     *
     * @param supplierList
     * @param supplierDiscountList
     * @return
     */
    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList,
                                                             List<SupplierDiscount> supplierDiscountList) {
        return supplierList
                .stream()
                .sorted(Comparator.comparing(Supplier::getCustomerId))
                .map(supplier -> {
                    int supplierDiscountPercentage = 0;
                    for (SupplierDiscount supplierDiscount : supplierDiscountList
                            .stream()
                            .filter(percent -> percent.getDiscountPercentage() > supplierDiscountPercentage)
                            .collect(Collectors.toList())) {
                        int discount = 0;
                        if (supplier.getCustomerId() == supplierDiscount.getCustomerId()
                                && supplierDiscount.getDiscountPercentage() > discount){
                            return new ShopWithMaxDiscountOwner(supplierDiscount.getStoreName(), supplier);
                        }
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(ShopWithMaxDiscountOwner::getStoreName, p -> p, (p, q) -> p)).values()
                .stream()
                .sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName))
                .collect(Collectors.toList());
    }
}
