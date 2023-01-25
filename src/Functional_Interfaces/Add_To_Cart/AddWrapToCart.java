package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Desserts;
import Products.Wraps;

public interface AddWrapToCart {

    static void addWrapToCart() {

        System.out.println("\nSelect dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 5) {
            System.out.println("Wrong number selected. Please try again");
            addWrapToCart();
        } else if (scanner == 4) {
            SystemStart.Start();
        } else if (scanner == 5) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.cartList.add(Wraps.wrapsList.get(scanner));
            System.out.printf("%.2f", Wraps.wrapsList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addWrapToCart();
        }
    }
}

