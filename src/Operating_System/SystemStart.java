package Operating_System;

import Interfaces.Add_To_Cart.*;
import Interfaces.Other.Farewell;
import Interfaces.Other.Menu_Display;
import Interfaces.Other.MyScanner;
import Products.*;
import Two4You.Two4You;

public class SystemStart {


    public static void Start() {

        System.out.println("\nWelcome in McRonald!\n");
        Menu_Display.displayMenu();
        System.out.print("\nEnter choice: ");
        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                Burger.displayBurgerList();
                AddBurgerToCart.addBurgerToCart();

                break;

            case 2:
                Wraps.displayWrapsList();
                AddWrapToCart.addWrapToCart();

                break;

            case 3:
                Fries.displayFriesList();
                AddFriesToCart.addFriesToCart();

                break;

            case 4:
                Nuggets.displayNuggetsList();
                AddNuggetsToCart.addNuggetsToCart();
                break;

            case 5:
                Drinks.displayDrinksList();
                AddDrinksToCart.addDrinksToCart();

                break;

            case 6:
                Coffees.displayCoffeesList();
                AddCoffeesToCart.addCoffeesToCart();

                break;

            case 7:
                Desserts.displayPreDessertList();
                AddDessertsToCart.displayDessertsMainMenu();
                break;

            case 8:
                Extras.displayExtrasList();
                AddExtrasToCart.addExtrasToCart();

                break;

            case 9:
                Two4You.two4YouMethod();


                break;

            case 10:


                break;

            case 11:


            case 12:
                Farewell.farewell();
                //trzeba zaimplementować ignoreCase'a
//                break;

            default:

               break;
        }
    }
}