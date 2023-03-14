package AddToCart;

import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Nuggets;

public class AddNuggetsToCart {
    public static void addNuggetsToCart() {

        int sizeOfNuggetsMenu = Nuggets.getNuggetsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "nuggets", sizeOfNuggetsMenu)-1;

        if (choice == 6) { SystemStart.Start(); }
        else if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Nuggets selectedNuggets = Nuggets.getNuggetsList().get(choice);
            double price = Nuggets.getNuggetsList().get(choice).getPrice();
            addSelectedNuggetsToCart(selectedNuggets, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addNuggetsToCart();
        }
    }

    static void addSelectedNuggetsToCart(Nuggets selectedNuggets, double price) {

        CartList.addToCartList(selectedNuggets);
        CartList.addToCartValue(price);
    }


}