package Functional_Interfaces.Other;

import FinalizationOrder.CartList;
import Functional_Interfaces.Other.MyScanner;
import Operating_System.SystemStart;

public interface Farewell {


    static void farewell () {
        if (!CartList.getCartList().isEmpty()) {
            System.out.println("You have items in your Cart. Are you sure you want exit?");
            String scannerChoice = MyScanner.myLineScanner();

            switch (scannerChoice) {
                case "Yes":
                    System.out.println("Thank you for visiting us!");
                    break;

                case "No":
                    SystemStart.Start();
                    break;
            }
        } else {
            System.out.println("Thank you for visiting us!");
        }
    }
}
