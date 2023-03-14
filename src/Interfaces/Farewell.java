package Interfaces;

import Finalization.CartList;
import OperatingSystem.SystemStart;

public interface Farewell {
    static void farewell() {
        if (!CartList.getCartList().isEmpty()) {
            System.out.println("You have items in your Cart. Are you sure you want exit? Y/N");
            String scannerChoice = MyScanner.myLineScanner();

            switch (scannerChoice) {
                case "Y":
                    System.out.println("Thank you for visiting us!");
                    break;

                case "N":
                    SystemStart.Start();
                    break;

                default:
                    farewell();
                    break;
            }
        } else {
            System.out.println("\nThank you for visiting us!");
        }
    }
}
