package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Desserts;
import Products.Drinks;

public interface AddDrinksToCart {
    static void addDrinksToCart() {

        System.out.println("\nSelect drink you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 12) {
            System.out.println("Wrong number selected. Please try again");
            addDrinksToCart();
        } else if (scanner == 11) {
            SystemStart.Start();
        } else if (scanner == 12) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.cartList.add(Drinks.drinksList.get(scanner));
            System.out.printf("%.2f", Drinks.drinksList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addDrinksToCart();
        }
    }
}

