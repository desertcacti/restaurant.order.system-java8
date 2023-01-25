package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.MyScanner;
import Operating_System.SystemStart;
import Products.Desserts;
import Products.Fries;

public interface AddFriesToCart {
    static void addFriesToCart() {

        System.out.println("\nSelect dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 5) {
            System.out.println("Wrong number selected. Please try again");
            addFriesToCart();
        } else if (scanner == 4) {
            SystemStart.Start();
        } else if (scanner == 5) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.cartList.add(Fries.friesList.get(scanner));
            System.out.printf("%.2f", Fries.friesList.get(scanner).getPrice());
            System.out.print(" PLN added to bill");
            addFriesToCart();
        }
    }
}

