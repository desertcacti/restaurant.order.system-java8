package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Coffees;
import Products.Desserts;

public interface AddDessertsToCart {
    static void addDessertsToCart() {

        System.out.println("\nSelect dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 18) {
            System.out.println("Wrong number selected. Please try again");
            addDessertsToCart();
        } else if (scanner == 17) {
            SystemStart.Start();
        } else if (scanner == 18) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.cartList.add(Desserts.dessertsList.get(scanner));
            System.out.printf("%.2f", Desserts.dessertsList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addDessertsToCart();
        }
    }
}

