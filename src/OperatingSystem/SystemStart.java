package OperatingSystem;

import Finalization.Finalization;
import Interfaces.Farewell;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import Products.*;
import Sets.Sets;
import SpecialOffers.SpecialOffers;
import Two4You.Two4You;

public class SystemStart implements getValidNumber {

    public static void main(String[] args) {
        Start();
    }

    public static void Start() {

        System.out.println("\nWelcome in McRonald!\n");
        displayMenu();

            int choice = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(), 12);

            switch (choice) {

                case 1:
                    Burger.displayBurgerMenu();
                    Burger.addBurgerToCart();

                    break;

                case 2:
                    Wraps.displayWrapsMenu();
                    Wraps.addWrapToCart();

                    break;

                case 3:
                    Fries.displayFriesMenu();
                    Fries.addFriesToCart();

                    break;

                case 4:
                    Nuggets.displayNuggetsMenu();
                    Nuggets.addNuggetsToCart();
                    break;

                case 5:
                    Drinks.displayDrinksMenu();
                    Drinks.addDrinksToCart();

                    break;

                case 6:
                    Coffees.displayCoffeesMenu();
                    Coffees.addCoffeesToCart();

                    break;

                case 7:
                    Desserts.displayPreDessertMenu();
                    Desserts.displayDessertsMainMenu();
                    break;

                case 8:
                    Extras.displayExtrasMenu();
                    Extras.addExtrasToCart();

                    break;

                case 9:
                    Two4You.two4YouMethod();


                    break;

                case 10:
                    Sets.setsStart();

                    break;

                case 11:
                    SpecialOffers.specialOffersStart();

                    break;

                case 12:
                    Finalization.finalizationOfOrder();
                    break;

                case 13:
                    Farewell.farewell();
                    break;

            }
        }


    static void displayMenu () {
        System.out.println("1.Burgers\n2.Wraps\n3.Fries\n4.Nuggets\n5.Drinks\n6.Coffees\n7.Desserts\n8.Extras\n9.Two4You\n10.Sets\n11.Special Offers\n\n12.Finalization\n13.Exit\n");
    }
}




