package Interfaces.Add_To_Cart;

import Customization.DessertsCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Operating_System.SystemStart;
import Products.Desserts;

public interface AddDessertsToCart {

    static void displayDessertsMainMenu() {

//        Desserts.displayPreDessertList();
        System.out.println("\nEnter choice: ");
        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                Desserts.displayDessertsList();
                addDessertsToCart();
                break;


            case 2:
                Desserts.displayIceCreamList();
                addIceCreamsToCart();
                break;

            case 3:
                Desserts.displayMcFlurryList();
                addMcFlurryToCart();
                break;

            case 4:
                SystemStart.Start();
                break;

            default:
                System.out.println("Wrong number selected. Please try again.");
                displayDessertsMainMenu();
                break;
        }
    }

    static void addDessertsToCart() {

        System.out.print("Select dessert you want to add to your order: ");
        int scanner = MyScanner.myIntScanner() - 1;

        if (scanner < 0 || scanner > 11) {
            System.out.println("Wrong number selected. Please try again.");
            addDessertsToCart();
        } else if (scanner == 10) {
            Desserts.displayPreDessertList();
            displayDessertsMainMenu();
        } else if (scanner == 11) {
            Finalization.finalizationOfOrder();
        } else {
            CartList.getCartList().add(Desserts.dessertsList.get(scanner));
            CartList.addToCartValue(Desserts.dessertsList.get(scanner).getPrice());
            System.out.printf("%.2f", Desserts.dessertsList.get(scanner).getPrice());
            System.out.print(" PLN added to bill\n");
            addDessertsToCart();

        }
    }

    static void addIceCreamsToCart() {
        System.out.print("Select ice cream you want to add to your order: ");
        int scanner = MyScanner.myIntScanner() - 1;

        if (scanner < 0 || scanner > 7) {
            System.out.println("Wrong number selected. Please try again.");
            addIceCreamsToCart();
        } else if (scanner == 6) {
            Desserts.displayPreDessertList();
            displayDessertsMainMenu();
        } else if (scanner == 7) {
            Finalization.finalizationOfOrder();
        } else {

            CartList.getCartList().add(Desserts.iceCreamsList.get(scanner));
            CartList.addToCartValue(Desserts.iceCreamsList.get(scanner).getPrice());
            System.out.printf("%.2f", Desserts.iceCreamsList.get(scanner).getPrice());
            System.out.print(" PLN added to bill\n");
            DessertsCustomization.iceCreamCustomization();



        }
    }

        static void addMcFlurryToCart() {

            System.out.print("Select McFlurry you want to add to your order: ");
            int scanner = MyScanner.myIntScanner() - 1;

            if (scanner < 0 || scanner > 13) {
                System.out.println("Wrong number selected. Please try again.");
                addMcFlurryToCart();
            } else if (scanner == 12) {
                Desserts.displayPreDessertList();
                displayDessertsMainMenu();
            } else if (scanner == 13) {
                Finalization.finalizationOfOrder();
            } else {
                CartList.addToCartList(Desserts.mcFlurryList.get(scanner));
                CartList.addToCartValue(Desserts.mcFlurryList.get(scanner).getPrice());
                System.out.printf("%.2f", Desserts.mcFlurryList.get(scanner).getPrice());
                System.out.print(" PLN added to bill\n");
                DessertsCustomization.mcFlurryCustomization();

            }
        }





    }



