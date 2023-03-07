package AddToCart;

import Customization.WrapsCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Wraps;
import Products.Wraps;

public class AddWrapToCart {

    public static void addWrapToCart() {

        int sizeOfWrapsMenu = Wraps.getWrapsList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "wrap", sizeOfWrapsMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 4) { SystemStart.Start(); }
        if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Wraps selectedWraps = Wraps.getWrapsList().get(choice);
            double price = Wraps.getWrapsList().get(choice).getPrice();
            addSelectedWrapsToCart(selectedWraps, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            WrapsCustomization.wrapsCustomization();
        }
    }

    static void addSelectedWrapsToCart(Wraps selectedWraps, double price) {

        CartList.addToCartList(selectedWraps);
        CartList.addToCartValue(price);
    }


}


