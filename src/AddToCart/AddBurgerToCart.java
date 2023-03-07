package AddToCart;

import Customization.BurgerCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
//import Interfaces.Other.SingletonScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Burger;

import java.util.Scanner;

public class AddBurgerToCart implements getValidNumber{
    public static void addBurgerToCart() {

        int sizeOfBurgerMenu = Burger.getBurgerList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "burger", sizeOfBurgerMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 11) { SystemStart.Start(); }
        if (choice == 12) { Finalization.finalizationOfOrder(); }

        else {
            Burger selectedBurger = Burger.getBurgerList().get(choice);
            double price = Burger.getBurgerList().get(choice).getPrice();
            addSelectedBurgerToCart(selectedBurger, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            BurgerCustomization.burgerCustomization();
        }
    }

    static void addSelectedBurgerToCart(Burger selectedBurger, double price) {

        CartList.addToCartList(selectedBurger);
        CartList.addToCartValue(price);
    }


}









