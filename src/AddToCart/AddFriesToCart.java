package AddToCart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Fries;
import Products.Fries;

public class AddFriesToCart {
    public static void addFriesToCart() {
        
        int sizeOfFriesMenu = Fries.getFriesList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "fries", sizeOfFriesMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 4) { SystemStart.Start(); }
        if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Fries selectedFries = Fries.getFriesList().get(choice);
            double price = Fries.getFriesList().get(choice).getPrice();
            addSelectedFriesToCart(selectedFries, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
        }
    }

    static void addSelectedFriesToCart(Fries selectedFries, double price) {

        CartList.addToCartList(selectedFries);
        CartList.addToCartValue(price);
    }


}

