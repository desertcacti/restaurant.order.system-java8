package AddToCart;

import Customization.BurgerCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Burger;
import Products.Extras;

public class AddExtrasToCart {
    public static void addExtrasToCart() {

        int sizeOfExtrasMenu = Extras.getExtrasList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "extras", sizeOfExtrasMenu)-1;

        if (choice == 10) { SystemStart.Start(); }
        else if (choice == 11) { Finalization.finalizationOfOrder(); }

        else {
            Extras selectedExtras = Extras.getExtrasList().get(choice);
            double price = Extras.getExtrasList().get(choice).getPrice();
            addSelectedExtrasToCart(selectedExtras, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addExtrasToCart();
        }
    }

    static void addSelectedExtrasToCart(Extras selectedExtras, double price) {

        CartList.addToCartList(selectedExtras);
        CartList.addToCartValue(price);
    }


}

