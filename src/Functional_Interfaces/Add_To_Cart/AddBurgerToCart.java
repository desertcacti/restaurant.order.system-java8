package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Burger;

import java.util.ArrayList;
import java.util.Scanner;

public interface AddBurgerToCart {
    static void addBurgerToCart() {

        System.out.println("\nSelect burger you want to add to your order: ");
        CartList.cartList.add(Burger.burgersList.get(MyScanner.myScanner()));

        if(MyScanner.myScanner() == 11) {


        //TRY TO USE CODE FROM PREVIOUS PROJECT - USE RECURENCY HERE


    }
}
