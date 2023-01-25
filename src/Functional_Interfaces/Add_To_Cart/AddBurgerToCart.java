package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Burger;

import java.util.ArrayList;
import java.util.Scanner;

public interface AddBurgerToCart {
    static void addBurgerToCart() {

        System.out.println("\nSelect burger you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 13) {
            System.out.println("Wrong number selected. Please try again");
            addBurgerToCart();
        } else if (scanner == 11) {
            SystemStart.Start();
        } else if (scanner == 12) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.cartList.add(Burger.burgersList.get(scanner));
            System.out.printf("%.2f", Burger.burgersList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addBurgerToCart();
        }
    }
}














