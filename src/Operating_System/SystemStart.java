package Operating_System;
import AddToCart.*;
import FinalizationOrder.Finalization;
import Interfaces.Other.*;
import Products.*;
import Sets.Sets;
import Two4You.Two4You;

public class SystemStart implements getValidNumber {
    public static void Start() {

        System.out.println("\nWelcome in McRonald!\n");
        Menu_Display.displayMenu();
        int choice = getValidNumber.getValidNumber(MyScanner.getNewInstance(), 12);

        switch (choice) {

            case 1:
                Burger.displayBurgerMenu();
                AddBurgerToCart.addBurgerToCart();

                break;

            case 2:
                Wraps.displayWrapsMenu();
                AddWrapToCart.addWrapToCart();

                break;

            case 3:
                Fries.displayFriesMenu();
                AddFriesToCart.addFriesToCart();

                break;

            case 4:
                Nuggets.displayNuggetsMenu();
                AddNuggetsToCart.addNuggetsToCart();
                break;

            case 5:
                Drinks.displayDrinksMenu();
                AddDrinksToCart.addDrinksToCart();

                break;

            case 6:
                Coffees.displayCoffeesMenu();
                AddCoffeesToCart.addCoffeesToCart();

                break;

            case 7:
                Desserts.displayPreDessertMenu();
                AddDessertsToCart.displayDessertsMainMenu();
                break;

            case 8:
                Extras.displayExtrasMenu();
                AddExtrasToCart.addExtrasToCart();

                break;

            case 9:
                Two4You.two4YouMethod();


                break;

            case 10:
                Sets.setsStart();

                break;

            case 11:
                Finalization.finalizationOfOrder();
                break;

            case 12:
                Farewell.farewell();
                break;

        }
    }
}



