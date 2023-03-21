package AddToCart;

import Customization.WrapsCustomization;
import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Wraps;

public class AddWrapToCart {

    public static void addWrapToCart() {

        int sizeOfWrapsMenu = Wraps.getWrapsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "wrap", sizeOfWrapsMenu)-1;

        if (choice == 4) { SystemStart.Start(); }
        else if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Wraps selectedWraps = Wraps.getWrapsList().get(choice);
            double price = Wraps.getWrapsList().get(choice).getPrice();
            String nameWithPrice = selectedWraps.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            WrapsCustomization.wrapsCustomization();
        }
    }
}


