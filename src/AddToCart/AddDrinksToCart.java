package AddToCart;

import Customization.BurgerCustomization;
import Customization.DrinksCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Burger;
import Products.Drinks;

public class AddDrinksToCart {
   public static void addDrinksToCart() {

        int sizeOfDrinksMenu = Drinks.getDrinksList().size()+2;
       //adding 2 to listSize - finalization option and back option.
       int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(),"drinks", sizeOfDrinksMenu)-1;

       if (choice == 11) { SystemStart.Start();}
       else if (choice == 12) { Finalization.finalizationOfOrder();}

       else {
           Drinks selectedDrink = Drinks.getDrinksList().get(choice);
           double price = Drinks.getDrinksList().get(choice).getPrice();
           addSelectedDrinkToCart(selectedDrink, price);
           System.out.printf("\n%.2f PLN added to bill.\n", price);
           DrinksCustomization.drinksCustomization();
        }
    }

    private static void addSelectedDrinkToCart(Drinks drink, double price) {

       CartList.addToCartList(drink);
       CartList.addToCartValue(price);


    }
}

