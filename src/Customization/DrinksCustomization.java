package Customization;

import Finalization.CartList;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import Products.Drinks;

public class DrinksCustomization {

    static int flag1 = 0;

    public static void drinksCustomization() {

        System.out.println("Do you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch (decision) {

            case "Y":
                displayDrinksAdditions();
                yesChosen();
                break;

            case "N":
                Drinks.addDrinksToCart();
                break;

            default:
                System.out.println("Please try again...");
                drinksCustomization();
                break;
        }
    }

   private static void yesChosen() {

        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance(),2, "drink");

            switch (choice) {

                case 1:
                    if (flag1 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                        break;
                    }

                    if (flag1 == 0) {
                        CartList.addToCartValue(0.00);
                        System.out.println("\n0.00 PLN added to bill");
                        flag1 = 1;
                        yesChosen();
                        break;
                    }
                    break;

                case 2:
                    setFlagsOnNull();
                    Drinks.displayDrinksMenu();
                    Drinks.addDrinksToCart();
                    break;
            }
        }

    private static void displayDrinksAdditions() {
        System.out.println("Additions:\n\n1.Ice - 0.00 PLN\n2.End customization\n");
    }
    private static void setFlagsOnNull() {
        flag1 = 0;
    }
}
