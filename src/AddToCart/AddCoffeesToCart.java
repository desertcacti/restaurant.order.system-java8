package AddToCart;

import Customization.BurgerCustomization;
import Customization.CoffeesCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Burger;
import Products.Coffees;

public class AddCoffeesToCart {
    public static void addCoffeesToCart() {

        int sizeOfCoffeesMenu = Coffees.getCoffeesList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "coffee", sizeOfCoffeesMenu + 2) - 1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 7) { SystemStart.Start(); }
        if (choice == 8) { Finalization.finalizationOfOrder();}

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


