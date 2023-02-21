package Customization;

import FinalizationOrder.CartList;
import Interfaces.Add_To_Cart.AddDrinksToCart;
import Interfaces.Add_To_Cart.AddWrapToCart;
import Interfaces.Other.MyScanner;
import Products.Drinks;
import Products.Wraps;

public class WrapsCustomization {
    static int flag1 = 0;
    static int flag2 = 0;
    static int flag3 = 0;
    static int flag4 = 0;
    static int flag5 = 0;
    static int flag6 = 0;


    public static void wrapsCustomization() {

        System.out.println("\nDo you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayWrapsAdditions();
                yesChosen();
                break;


            case "N":
                AddWrapToCart.addWrapToCart();
                break;

            default:
                System.out.println("Please try again...");
                displayWrapsAdditions();
                break;

        }
    }

    static void yesChosen() {

        System.out.println("Select addition you want to add to wrap: ");
        int choice = MyScanner.myIntScanner();

        if (choice < 1 || choice > 7) {
            System.out.println("Please try again...");
            yesChosen();
        } else {

            switch (choice) {

                case 1:
                    if (flag1 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag1 == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("2.00 PLN added to bill");
                        flag1 = 1;
                        yesChosen();
                    }
                    break;

                case 2:
                    if (flag2 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag2 == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("2.00 PLN added to bill");
                        flag2 = 1;
                        yesChosen();
                    }
                    break;

                case 3:
                    if (flag3 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag3 == 0) {
                        CartList.addToCartValue(0.50);
                        System.out.println("0.50 PLN added to bill");
                        flag3 = 1;
                        yesChosen();
                    }
                    break;

                case 4:
                    if (flag4 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag4 == 0) {
                        CartList.addToCartValue(0.50);
                        System.out.println("0.50 PLN added to bill");
                        flag4 = 1;
                        yesChosen();
                    }
                    break;


                case 5:
                    if (flag5 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag5 == 0) {
                        CartList.addToCartValue(0.50);
                        System.out.println("0.50 PLN added to bill");
                        flag5 = 1;
                        yesChosen();
                    }
                    break;


                case 6:
                    if (flag6 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    }
                    if (flag6 == 0) {
                        CartList.addToCartValue(0.50);
                        System.out.println("0.50 PLN added to bill");
                        flag6 = 1;
                        yesChosen();
                    }
                    break;

                case 7:

                    Wraps.displayWrapsList();
                    AddWrapToCart.addWrapToCart();
                    break;


            }
        }
    }




    static void displayWrapsAdditions() {

        System.out.println("1.Chicken - 2.00 PLN\n2.Bacon- 2.00 PLN\n3.Tomato - 0.50 PLN\n4.Sauce - 0.50 PLN\n5.Lettuce - 0.50 PLN\n6.Cheddar - 0.50 PLN\n\n7.End customization");


    }






}
