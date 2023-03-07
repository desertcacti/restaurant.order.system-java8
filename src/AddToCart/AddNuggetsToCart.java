package AddToCart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Nuggets;
import Products.Nuggets;

public class AddNuggetsToCart {
    public static void addNuggetsToCart() {

        int sizeOfNuggetsMenu = Nuggets.getNuggetsList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "nuggets", sizeOfNuggetsMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 6) { SystemStart.Start(); }
        if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Nuggets selectedNuggets = Nuggets.getNuggetsList().get(choice);
            double price = Nuggets.getNuggetsList().get(choice).getPrice();
            addSelectedNuggetsToCart(selectedNuggets, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
        }
    }

    static void addSelectedNuggetsToCart(Nuggets selectedNuggets, double price) {

        CartList.addToCartList(selectedNuggets);
        CartList.addToCartValue(price);
    }


}