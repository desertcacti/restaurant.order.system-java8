package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.Other.MyScanner;
import Operating_System.SystemStart;
import Products.Coffees;
import Products.Fries;
import Products.Nuggets;

public interface AddNuggetsToCart {
    static void addNuggetsToCart() {

        System.out.println("\nSelect dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 7) {
            System.out.println("Wrong number selected. Please try again");
            addNuggetsToCart();
        } else if (scanner == 6) {
            SystemStart.Start();
        } else if (scanner == 7) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.getCartList().add(Nuggets.nuggetsList.get(scanner));
            CartList.addToCartValue(Nuggets.nuggetsList.get(scanner).getPrice());
            System.out.printf("%.2f", Nuggets.nuggetsList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addNuggetsToCart();

        }
    }
}

