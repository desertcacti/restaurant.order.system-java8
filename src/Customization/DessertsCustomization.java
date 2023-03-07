package Customization;

import FinalizationOrder.CartList;
import AddToCart.AddDessertsToCart;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Products.Desserts;

public class DessertsCustomization {

    static int flag1IceCream = 0;
    static int flag1McFlurry = 0;
    static int flag2McFlurry = 0;


    public static void iceCreamCustomization() {

        System.out.println("Do you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayIceCreamsAdditions();
                yesChosenForIceCreamCustomization();
                break;


            case "N":
                AddDessertsToCart.addIceCreamsToCart();
                break;

            default:
                System.out.println("Please try again...");
                iceCreamCustomization();
                break;

        }
    }

    static void yesChosenForIceCreamCustomization() {

        System.out.println("Select addition you want to add to ice cream:");
        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance());

//        if (choice < 1 || choice > 2) {
//            System.out.println("Please try again...");
//            yesChosenForIceCreamCustomization();
//        } else {

            switch (choice) {

                case 1:
                    if (flag1IceCream == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosenForIceCreamCustomization();
                        break;
                    }
                    if (flag1IceCream == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("2.00 PLN added to bill");
                        flag1IceCream = 1;
                        yesChosenForIceCreamCustomization();
                        break;
                    }
                    break;

                case 2:
                    setFlagsOnNull();
                    Desserts.displayIceCreamMenu();
                    AddDessertsToCart.addIceCreamsToCart();
                    break;


            }
        }
//    }

    public static void mcFlurryCustomization() {

        System.out.println("\nDo you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayMcFlurryAdditions();
                yesChosenForMcFlurryCustomization();
                break;


            case "N":
                AddDessertsToCart.addMcFlurryToCart();
                break;

            default:
                System.out.println("Please try again...");
                displayMcFlurryAdditions();
                break;

        }
    }

    static void yesChosenForMcFlurryCustomization() {

        System.out.println("Select addition you want to add to McFlurry: ");
        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance());

//        if (choice < 1 || choice > 3) {
//            System.out.println("Please try again...");
//            yesChosenForMcFlurryCustomization();
//        } else {

            switch (choice) {

                case 1:
                    if (flag1McFlurry == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    if (flag1McFlurry == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("2.00 PLN added to bill");
                        flag1McFlurry = 1;
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    break;

                case 2:
                    if (flag2McFlurry == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    if (flag2McFlurry == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("2.00 PLN added to bill");
                        flag2McFlurry = 1;
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    break;



                case 3:
                    setFlagsOnNull();
                    Desserts.displayMcFlurryMenu();
                    AddDessertsToCart.addMcFlurryToCart();
                    break;


            }
        }
//    }

    static void displayIceCreamsAdditions() {

        System.out.println("1.Additional coating - 2.00 PLN\n2.End customization\n");
    }

    static void displayMcFlurryAdditions() {

        System.out.println("1.Additional coating - 2.00 PLN\n2.Additional sprinkles - 2.00 PLN\n\n3.End customization\n");
    }

    private static void setFlagsOnNull() {

        flag1IceCream = 0;
        flag1McFlurry = 0;
        flag2McFlurry = 0;

    }

}
