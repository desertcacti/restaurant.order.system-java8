package AddToCart;

import Customization.BurgerCustomization;
import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
//import Interfaces.Other.SingletonScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Burger;

public class AddBurgerToCart implements getValidNumber{

        public static void addBurgerToCart() {

            int sizeOfBurgerMenu = Burger.getBurgerList().size()+2;
            //adding 2 to listSize - finalization option and back option.
                int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(),"burger", sizeOfBurgerMenu) - 1;

                if (choice == 11) {
                    SystemStart.Start();
                } else if (choice == 12) {
                    Finalization.finalizationOfOrder();
                } else {
                    Burger selectedBurger = Burger.getBurgerList().get(choice);
                    double price = Burger.getBurgerList().get(choice).getPrice();
                    addSelectedBurgerToCart(selectedBurger, price);
                    System.out.printf("\n%.2f PLN added to bill.\n", price);
                    BurgerCustomization.burgerCustomization();
                }
            }



    static void addSelectedBurgerToCart(Burger selectedBurger, double price) {

        CartList.addToCartList(selectedBurger);
        CartList.addToCartValue(price);
    }


}









