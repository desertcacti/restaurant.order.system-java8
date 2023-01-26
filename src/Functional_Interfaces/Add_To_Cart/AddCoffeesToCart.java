package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.Other.MyScanner;
import Operating_System.SystemStart;
import Products.Burger;
import Products.Coffees;

public interface AddCoffeesToCart {
    static void addCoffeesToCart() {

        System.out.println("\nSelect coffee you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 8) {
            System.out.println("Wrong number selected. Please try again");
            addCoffeesToCart();
        } else if (scanner == 7) {
            SystemStart.Start();
        } else if (scanner == 8) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.getCartList().add(Coffees.coffeesList.get(scanner));
            CartList.addToCartValue(Coffees.coffeesList.get(scanner).getPrice());
            System.out.printf("%.2f", Coffees.coffeesList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addCoffeesToCart();

        }
    }
}


