package Customization;

import Finalization.CartList;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
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
                Desserts.addIceCreamsToCart();
                break;

            default:
                System.out.println("Please try again...");
                iceCreamCustomization();
                break;

        }
    }

    static void yesChosenForIceCreamCustomization() {

        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance(),2, "ice cream");

            switch (choice) {

                case 1:
                    if (flag1IceCream == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosenForIceCreamCustomization();
                        break;
                    }
                    if (flag1IceCream == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("\n2.00 PLN added to bill");
                        flag1IceCream = 1;
                        yesChosenForIceCreamCustomization();
                        break;
                    }
                    break;

                case 2:
                    setFlagsOnNull();
                    Desserts.displayIceCreamMenu();
                    Desserts.addIceCreamsToCart();
                    break;


            }
        }

    public static void mcFlurryCustomization() {

        System.out.println("Do you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayMcFlurryAdditions();
                yesChosenForMcFlurryCustomization();
                break;


            case "N":
                Desserts.addMcFlurryToCart();
                break;

            default:
                System.out.println("Please try again...");
                mcFlurryCustomization();
                break;

        }
    }

    static void yesChosenForMcFlurryCustomization() {

        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance(),3, "McFlurry");

            switch (choice) {

                case 1:
                    if (flag1McFlurry == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    if (flag1McFlurry == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("\n2.00 PLN added to bill");
                        flag1McFlurry = 1;
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    break;

                case 2:
                    if (flag2McFlurry == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    if (flag2McFlurry == 0) {
                        CartList.addToCartValue(2.00);
                        System.out.println("\n2.00 PLN added to bill");
                        flag2McFlurry = 1;
                        yesChosenForMcFlurryCustomization();
                        break;
                    }
                    break;

                case 3:
                    setFlagsOnNull();
                    Desserts.displayMcFlurryMenu();
                    Desserts.addMcFlurryToCart();
                    break;


            }
        }

    static void displayIceCreamsAdditions() {

        System.out.println("Additions:\n\n1.Additional coating - 2.00 PLN\n2.End customization\n");
    }

    static void displayMcFlurryAdditions() {

        System.out.println("Additions:\n\n1.Additional coating - 2.00 PLN\n2.Additional sprinkles - 2.00 PLN\n\n3.End customization\n");
    }

    private static void setFlagsOnNull() {

        flag1IceCream = 0;
        flag1McFlurry = 0;
        flag2McFlurry = 0;

    }

}
