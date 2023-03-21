package OperatingSystem;
import AddToCart.*;
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




