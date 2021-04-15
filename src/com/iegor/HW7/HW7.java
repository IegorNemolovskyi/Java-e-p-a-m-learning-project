package com.iegor.HW7;

import com.iegor.Lectures.Lecture7.People.Person;

import java.math.BigDecimal;
import java.util.Arrays;

public class HW7 {
    /**
     * Task #6 Inheritance
     * To create classes **Employee**, **SalesPerson**, **Manager** and **Company** with predefined functionality.
     * <p>
     * Low level requires:
     * To create basic class **Employee** and declare following content:
     * • Three closed fields – text field with **lastName** (employee last Name), money fields – **salary** and **bonus**
     * • Public property **lastName** for reading employee’s last name
     * • Public property **salary** for reading and recording salary field
     * • Constructor with parameters string **lastName** and money **salary** (last name and salary are set)
     * • Virtual method **setBonus** that sets bonuses to **salary**, amount of which is delegated/conveyed as **bonus**
     * • Method **toPay** that returns the value of summarized salary and bonus.
     * <p>
     * To create class **SalesPerson** as class **Employee** inheritor and declare within it:
     * • Closed integer field **percent** (percent of sales targets plan performance/execution)
     * • Constructor with parameters: **name** – employee last name, **salary**, **percent** – percent of plan performance,
     * first two of which are passed to basic class constructor
     * • Redefine virtual method of parent class **setBonus** in the following way: if the sales person completed the plan more
     * than 100%, so his bonus is doubled (is multiplied by 2), and if more than 200% - bonus is tripled (is multiplied by 3)
     * <p>
     * To create class **Manager** as **Employee** class inheritor, and declare with it:
     * • Closed integer field **quantity** (number of clients, who were served by the manager during a month)
     * • Constructor with parameters string **name** – employee last name, salary and integer clientAmount – number of served
     * clients, first two of which are passed to basic class constructor.
     * • Redefine virtual method of parent class **setBonus** in the following way: if the manager served over 100 clients,
     * his bonus is increased by 500, and if more than 150 clients – by 1000.
     * <p>
     * Task advanced
     * To fully complete Low level tasks.
     * Create class Company and declare within it:
     * Closed field employees (staff)  an array of Employee type.
     * Constructor that receives employee array of Employee type with arbitrary length
     * Method giveEverybodyBonus with money parameter companyBonus that sets the amount of basic bonus for each employee.
     * Method totalToPay that returns total amount of salary of all employees including awarded bonus
     * Method nameMaxSalary that returns employee last name, who received maximum salary including bonus.
     **/
    public static void main(String[] args) {

        Employee sp1 = new SalesPerson("Fan", BigDecimal.valueOf(10000), 99);
        Employee sp2 = new SalesPerson("Goolta", BigDecimal.valueOf(10000), 101);
        Employee sp3 = new SalesPerson("Nizhnyk", BigDecimal.valueOf(10000), 201);
        Employee mng1 = new Manager("Todorov", BigDecimal.valueOf(10000), 100);
        Employee mng2 = new Manager("Haidamaka", BigDecimal.valueOf(10000), 150);
        Employee mng3 = new Manager("Spassich", BigDecimal.valueOf(10000), 151);
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        System.out.println(mng1);
        System.out.println(mng2);
        System.out.println(mng3);

        Employee[] employees = new Employee[6];
        employees[0] = sp1;
        employees[1] = sp2;
        employees[2] = sp3;
        employees[3] = mng1;
        employees[4] = mng2;
        employees[5] = mng3;

        Company cList = new Company(employees);
        System.out.println("Total company payments = " + cList.totalToPay());
        cList.giveEverybodyBonus(BigDecimal.valueOf(2));
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        System.out.println(mng1);
        System.out.println(mng2);
        System.out.println(mng3);
        System.out.println("Total company payments = " + cList.totalToPay());
    }
}
