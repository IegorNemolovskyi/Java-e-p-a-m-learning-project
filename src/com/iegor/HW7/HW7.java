package com.iegor.HW7;

import java.math.BigDecimal;

public class HW7 {
/**
 * Task #6 Inheritance
 To create classes **Employee**, **SalesPerson**, **Manager** and **Company** with predefined functionality.

 Low level requires:
 To create basic class **Employee** and declare following content:
 • Three closed fields – text field with **lastName** (employee last Name), money fields – **salary** and **bonus**
 • Public property **lastName** for reading employee’s last name
 • Public property **salary** for reading and recording salary field
 • Constructor with parameters string **lastName** and money **salary** (last name and salary are set)
 • Virtual method **setBonus** that sets bonuses to **salary**, amount of which is delegated/conveyed as **bonus**
 • Method **toPay** that returns the value of summarized salary and bonus.

 To create class **SalesPerson** as class **Employee** inheritor and declare within it:
 • Closed integer field **percent** (percent of sales targets plan performance/execution)
 • Constructor with parameters: **name** – employee last name, **salary**, **percent** – percent of plan performance,
 first two of which are passed to basic class constructor
 • Redefine virtual method of parent class **setBonus** in the following way: if the sales person completed the plan more
 than 100%, so his bonus is doubled (is multiplied by 2), and if more than 200% - bonus is tripled (is multiplied by 3)

 To create class **Manager** as **Employee** class inheritor, and declare with it:
 • Closed integer field **quantity** (number of clients, who were served by the manager during a month)
 • Constructor with parameters string **name** – employee last name, salary and integer clientAmount – number of served
 clients, first two of which are passed to basic class constructor.
 • Redefine virtual method of parent class **setBonus** in the following way: if the manager served over 100 clients,
 his bonus is increased by 500, and if more than 150 clients – by 1000.
 **/
    public static void main(String[] args) {

        SalesPerson sp1 = new SalesPerson("Fan", BigDecimal.valueOf(10000),99);
        SalesPerson sp2 = new SalesPerson("Goolta", BigDecimal.valueOf(10000),101);
        SalesPerson sp3 = new SalesPerson("Nizhnyk", BigDecimal.valueOf(10000),201);
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);

        Manager mng1 = new Manager("Todorov",BigDecimal.valueOf(9000),100);
        Manager mng2 = new Manager("Haidamaka",BigDecimal.valueOf(10000),150);
        Manager mng3 = new Manager("Spassich",BigDecimal.valueOf(10000),151);
        System.out.println(mng1);
        System.out.println(mng2);
        System.out.println(mng3);

    }
}
