package Customization;

import FinalizationOrder.CartList;
import AddToCart.AddDrinksToCart;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Products.Drinks;

public class DrinksCustomization {

    static int flag1 = 0;

    public static void drinksCustomization() {

        System.out.println("\nDo you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayDrinksAdditions();
                yesChosen();
                break;


            case "N":
                AddDrinksToCart.addDrinksToCart();
                break;

            default:
                System.out.println("Please try again...");
                displayDrinksAdditions();
                break;

        }
    }

    static void yesChosen() {

        System.out.println("Select addition you want to add to your drink: ");
//        int choice = MyScanner.myIntScanner();

        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance());
//
//        if (choice < 1 || choice > 2) {
//            System.out.println("Please try again...");
//            yesChosen();
//        } else {

            switch (choice) {

                case 1:
                    if (flag1 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                        break;
                    }
                    if (flag1 == 0) {
                        CartList.addToCartValue(0.00);
                        System.out.println("0.00 PLN added to bill");
                        flag1 = 1;
                        yesChosen();
                        break;
                    }
                    break;

                case 2:

                    setFlagsOnNull();
                    Drinks.displayDrinksMenu();
                    AddDrinksToCart.addDrinksToCart();
                    break;


            }
        }
//    }


    static void displayDrinksAdditions() {

        System.out.println("1.Ice - 0.00 PLN\n2.End customization");


    }
    private static void setFlagsOnNull() {

        flag1 = 0;


    }

}
