package Operating_System;

import FinalizationOrder.CartList;
import Functional_Interfaces.Add_To_Cart.*;
import Functional_Interfaces.Farewell;
import Functional_Interfaces.Menu_Display;
import Functional_Interfaces.Add_Generic_Item_To_Cart;
import Functional_Interfaces.MyScanner;
import Products.*;

import java.util.Scanner;

public class SystemStart {


    public static void Start() {

        System.out.println("Welcome in McRonald!\n");

//        Scanner sc = new Scanner(System.in);
        Menu_Display.displayMenu();

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

                Desserts.displayDessertsList();
                AddDessertsToCart.addDessertsToCart();

                break;

            case 8:
                Extras.displayExtrasList();
                AddExtrasToCart.addExtrasToCart();

                break;

            case 9:
                Farewell.farewell();
                //trzeba zaimplementować ignoreCase'a
        }
    }
}