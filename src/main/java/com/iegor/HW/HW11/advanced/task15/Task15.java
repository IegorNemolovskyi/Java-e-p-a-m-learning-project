package com.iegor.HW.HW11.advanced.task15;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {
    /**
     * Task 15.
     *
     * A sequence of information about goods goodList of type Good and a sequence of prices of goods in various stores
     * storePriceList of type StorePrice are given.
     * Each element of the goodList sequence includes the <product_SKU>, <country_of_origin> fields.
     * Each element of the storePriceList sequence includes the <product_SKU>, <store_Title>, fields.
     * For each country of origin get the number of stores offering goods manufactured in that country,
     * as well as the minimum price for goods from this country for all stores (CountryStat values).
     * If no product is found for a certain country that is presented in any store, then the number of stores
     * and the minimum price are assumed to be 0. Sort the list by country of origin.
     *
     * Look at the template on the end of the task before solving the problem. For example:
     * input: { Good(1, "milk", "Poland"), Good(2, "milk", "Russia") }, { StorePrice(1, "BigShop", BigDecimal("12.50")),
     * StorePrice(1, "SushiBar", BigDecimal("10.50")), StorePrice(2, "BigShop", BigDecimal("12.50")) }
     * output: { CountryStat("Poland", 2, BigDecimal("10.50)), CountryStat("Russia", 1, BigDecimal("12.50")) }
     *
     * @param goodList
     * @param storePriceList
     * @return
     */

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        return goodList.stream()
                .flatMap(good -> {
                    boolean goodIsAvailable = false;
                    for (StorePrice store: storePriceList) {
                        if (store.getProductSKU() == good.getProductSKU()){
                            goodIsAvailable = true;
                            break;
                        }
                    }
                    if (goodIsAvailable){
                        return storePriceList.stream()
                                .filter(storePrice -> storePrice.getProductSKU() == good.getProductSKU())
                                .sorted(Comparator.comparing(StorePrice::getPrice))
                                .map(storePrice -> new CountryStat(good.getCountryOfOrigin(),
                                        storePriceList.stream().
                                                filter(price -> price.getProductSKU() == good.getProductSKU()).count(), storePrice.getPrice()));
                    }
                    return storePriceList.stream().map(storePrice -> new CountryStat(good.getCountryOfOrigin(), 0, new BigDecimal(BigInteger.ZERO)));
                })
                .collect(Collectors.toMap(CountryStat::getCountryOfOrigin, p -> p, (p, q) -> p)).values()
                .stream()
                .sorted(Comparator.comparing(CountryStat::getCountryOfOrigin))
                .collect(Collectors.toList());
    }
}
