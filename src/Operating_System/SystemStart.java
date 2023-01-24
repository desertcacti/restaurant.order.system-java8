package Operating_System;

import FinalizationOrder.CartList;
import Functional_Interfaces.Add_To_Cart.AddBurgerToCart;
import Functional_Interfaces.Menu_Display;
import Functional_Interfaces.Add_Generic_Item_To_Cart;
import Products.*;

import java.util.Scanner;

public class SystemStart implements Menu_Display, Add_Generic_Item_To_Cart {

    public static void Start () {

        System.out.println("Welcome in McRonald!\n");

        Scanner sc = new Scanner(System.in);
        Menu_Display.displayMenu();

        int choice = sc.nextInt();

        switch(choice) {


            case 1:
                Burger.displayBurgerList();
                AddBurgerToCart.addBurgerToCart();
                CartList.printCartList();
                break;

            case 2:
                Wraps.displayWrapsList();


                break;

            case 3:
                Fries.displayFriesList();


                break;

            case 4:
                Nuggets.displayNuggetsList();

                break;

            case 5:
                Drinks.displayDrinksList();


                break;

            case 6:
                Coffees.displayCoffeesList();


                break;

            case 7:
                Desserts.displayDessertsList();


                break;

            case 8:
                Extras.displayExtrasList();


                break;

            case 9:
                /// implement exit option


                break;
        }
    }






//end
}
