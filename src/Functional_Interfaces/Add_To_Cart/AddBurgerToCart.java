package Functional_Interfaces.Add_To_Cart;

import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Functional_Interfaces.Customization.BurgerCustomization;
//import Functional_Interfaces.Other.Customization;
import Functional_Interfaces.Other.MyScanner;
import Operating_System.SystemStart;
import Products.Burger;

public interface AddBurgerToCart {
    static void addBurgerToCart() {

//        System.out.println("\nSelect burger you want to add to your order: ");
//        int scanner = MyScanner.myIntScanner()-1;
//
//        if (scanner < 0 || scanner > 13) {
//            System.out.println("Wrong number selected. Please try again");
//            addBurgerToCart();
//        } else if (scanner == 11) {
//            SystemStart.Start();
//        } else if (scanner == 12) {
//            Finalization.finalizationOfOrder();
//        } else {
//            CartList.getCartList().add(Burger.burgersList.get(scanner));
//            CartList.addToCartValue(Burger.burgersList.get(scanner).getPrice());
//            System.out.printf("%.2f", Burger.burgersList.get(scanner).getPrice());
//            System.out.print(" PLN added to bill");
//            addBurgerToCart();

        // kod do góry zawiera wersje starą bez customizacji

        System.out.println("\nSelect burger you want to add to your order: ");
        int scanner = MyScanner.myIntScanner()-1;

        if (scanner < 0 || scanner > 13) {
            System.out.println("Wrong number selected. Please try again");
            addBurgerToCart();
        } else if (scanner == 11) {
            SystemStart.Start();
        } else if (scanner == 12) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.getCartList().add(Burger.burgersList.get(scanner));
            CartList.addToCartValue(Burger.burgersList.get(scanner).getPrice());
            System.out.printf("%.2f", Burger.burgersList.get(scanner).getPrice());
            System.out.print(" PLN added to bill\n");
            BurgerCustomization.burgerCustomization();










//            addBurgerToCart();


        }
    }
}















