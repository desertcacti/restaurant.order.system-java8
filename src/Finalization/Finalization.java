package Finalization;

import Interfaces.MyScanner;
import Interfaces.getValidNumber;

import java.sql.SQLOutput;

public class Finalization {



   public static void finalizationOfOrder () {

            CartList.printCartList();
            CartList.cartCustomizationMethod();
    }


    public static void orderSettlement() {

        System.out.printf("\nTotal sum of your Cart is: %.2f PLN\n\n", CartList.getCartValue());
        System.out.println("Select payment method:\n1.Cash\n2.Card");

        System.out.print("Enter choice: ");
        int choice = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(), 2);

        switch(choice) {


            case 1:
                cashMethod();
                break;


            case 2:
                cardMethod();
                break;


        }

    }


        private static void cardMethod() {

        }

        private static void cashMethod() {



        }
}
