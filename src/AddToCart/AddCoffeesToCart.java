package AddToCart;

import Customization.CoffeesCustomization;
import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Coffees;

public class AddCoffeesToCart {
    public static void addCoffeesToCart() {

        int sizeOfCoffeesMenu = Coffees.getCoffeesList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "coffee", sizeOfCoffeesMenu) - 1;

        if (choice == 7) { SystemStart.Start(); }
        else if (choice == 8) { Finalization.finalizationOfOrder();}

        else {
            Coffees selectedCoffee = Coffees.getCoffeesList().get(choice);
            double price = Coffees.getCoffeesList().get(choice).getPrice();
            addSelectedCoffeeToCart(selectedCoffee, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            CoffeesCustomization.coffeesCustomization();
        }
    }

    static void addSelectedCoffeeToCart(Coffees coffee, double price) {

        CartList.addToCartList(coffee);
        CartList.addToCartValue(price);
    }


}


