package Customization;

import FinalizationOrder.CartList;
import Interfaces.Add_To_Cart.AddCoffeesToCart;
import Interfaces.Add_To_Cart.AddDrinksToCart;
import Interfaces.Other.MyScanner;
import Products.Coffees;
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
        int choice = MyScanner.myIntScanner();

        if (choice < 1 || choice > 2) {
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
                        CartList.addToCartValue(0.00);
                        System.out.println("0.00 PLN added to bill");
                        flag1 = 1;
                        yesChosen();
                    }
                    break;

                case 2:

                    Drinks.displayDrinksList();
                    AddDrinksToCart.addDrinksToCart();
                    break;


            }
        }
    }


    static void displayDrinksAdditions() {

        System.out.println("1.Ice - 0.00 PLN\n2.End customization");


    }


}
