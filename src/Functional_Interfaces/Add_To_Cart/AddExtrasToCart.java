package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.Other.MyScanner;
import Operating_System.SystemStart;
import Products.Coffees;
import Products.Drinks;
import Products.Extras;

public interface AddExtrasToCart {
    static void addExtrasToCart() {

        System.out.println("\nSelect dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 11) {
            System.out.println("Wrong number selected. Please try again");
            addExtrasToCart();
        } else if (scanner == 10) {
            SystemStart.Start();
        } else if (scanner == 11) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.getCartList().add(Extras.extrasList.get(scanner));
            CartList.addToCartValue(Extras.extrasList.get(scanner).getPrice());
            System.out.printf("%.2f", Extras.extrasList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addExtrasToCart();

        }
    }
}

