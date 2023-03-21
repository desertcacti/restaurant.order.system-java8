package AddToCart;

import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Fries;

public class AddFriesToCart {
    public static void addFriesToCart() {
        
        int sizeOfFriesMenu = Fries.getFriesList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "fries", sizeOfFriesMenu)-1;

        if (choice == 4) { SystemStart.Start(); }
        else if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Fries selectedFries = Fries.getFriesList().get(choice);
            double price = Fries.getFriesList().get(choice).getPrice();
            String nameWithPrice = selectedFries.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addFriesToCart();
        }
    }
}

