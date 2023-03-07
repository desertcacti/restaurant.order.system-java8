package AddToCart;

import Customization.BurgerCustomization;
import Customization.DessertsCustomization;
import FinalizationOrder.CartList;
import FinalizationOrder.Finalization;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Operating_System.SystemStart;
import Products.Burger;
import Products.Desserts;

public class AddDessertsToCart {

    public static void displayDessertsMainMenu() {

//        Desserts.displayPreDessertList();
        System.out.println("\nEnter choice: ");
        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                Desserts.displayDessertsMenu();
                addDessertsToCart();
                break;


            case 2:
                Desserts.displayIceCreamMenu();
                addIceCreamsToCart();
                break;

            case 3:
                Desserts.displayMcFlurryMenu();
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


    public static void addDessertsToCart() {

        int sizeOfDessertMenu = Desserts.getDessertsList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "dessert", sizeOfDessertMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 10) { SystemStart.Start(); }
        if (choice == 11) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedDessert = Desserts.getDessertsList().get(choice);
            double price = Desserts.getDessertsList().get(choice).getPrice();
            addSelectedDessertToCart(selectedDessert, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);

        }
    }

    static void addSelectedDessertToCart(Desserts selectedDessert, double price) {

        CartList.addToCartList(selectedDessert);
        CartList.addToCartValue(price);
    }


    public static void addIceCreamsToCart() {

        int sizeOfIceCreamsMenu = Desserts.getIceCreamsList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "ice cream", sizeOfIceCreamsMenu+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 6) { SystemStart.Start(); }
        if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedIceCream = Desserts.getIceCreamsList().get(choice);
            double price = Desserts.getIceCreamsList().get(choice).getPrice();
            addSelectedDessertToCart(selectedIceCream, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.iceCreamCustomization();

        }
    }

    public static void addMcFlurryToCart() {

        int sizeOfIceMcFlurry = Desserts.getMcFlurryList().size();
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "McFlurry", sizeOfIceMcFlurry+2)-1;
        //adding 2 to listSize - finalization option and back option.

        if (choice == 12) { SystemStart.Start(); }
        if (choice == 13) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedMcFlurry = Desserts.getMcFlurryList().get(choice);
            double price = Desserts.getMcFlurryList().get(choice).getPrice();
            addSelectedDessertToCart(selectedMcFlurry, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.mcFlurryCustomization();
        }
    }





    }



