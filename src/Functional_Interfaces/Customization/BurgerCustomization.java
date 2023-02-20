package Functional_Interfaces.Customization;

import FinalizationOrder.CartList;
import Functional_Interfaces.Add_To_Cart.AddBurgerToCart;
import Functional_Interfaces.Add_To_Cart.AddNuggetsToCart;
import Functional_Interfaces.Other.MyScanner;
import Products.Burger;

public interface BurgerCustomization {

    static void burgerCustomization() {

        System.out.println("Do you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch(decision) {

            case "Y":
                displayBurgerAdditions();
                yesChosen();
                break;


            case "N":
                AddBurgerToCart.addBurgerToCart();
                break;

            default:
                System.out.println("Please try again...");
                burgerCustomization();
                break;

        }
    }

    static void yesChosen() {

        System.out.println("Select addition you want to add to burger: ");
        int choice = MyScanner.myIntScanner();

        if (choice < 1 || choice > 7) {
            System.out.println("Please try again...");
            yesChosen();
        } else {
            switch (choice) {

                case 1:
                    CartList.addToCartValue(4.00);
                    System.out.println("4,00 PLN added to bill");
                    yesChosen();
                    break;


                case 2:
                    CartList.addToCartValue(0.50);
                    System.out.println("0,50 PLN added to bill");
                    yesChosen();
                    break;

                case 3:
                    CartList.addToCartValue(0.50);
                    System.out.println("0,50 PLN added to bill");
                    yesChosen();
                    break;

                case 4:
                    CartList.addToCartValue(0.50);
                    System.out.println("0,50 PLN added to bill");
                    yesChosen();
                    break;

                case 5:
                    CartList.addToCartValue(0.50);
                    System.out.println("0,50 PLN added to bill");
                    yesChosen();
                    break;
                case 6:
                    CartList.addToCartValue(0.50);
                    System.out.println("0,50 PLN added to bill");
                    yesChosen();
                    break;

                case 7:
                    Burger.displayBurgerList();
                    AddBurgerToCart.addBurgerToCart();
                    break;


            }
        }
    }

    static void displayBurgerAdditions() {
        System.out.println("1.Meat - 4,00 PLN\n2.Sauce - 0,50 PLN\n3.Lettuce - 0,50 PLN\n4.Cheddar - 0,50 PLN\n5.Pickles - 0,50 PLN\n6.Onion - 0,50 PLN\n\n7.End customization\n");
    }











}
