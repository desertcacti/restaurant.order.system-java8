package AddToCart;

import Customization.DessertsCustomization;
import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Desserts;

public class AddDessertsToCart {

    public static void displayDessertsMainMenu() {

        int choice = getValidNumber.getValidNumber(MyScanner.getNewInstance(),4);

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

        int sizeOfDessertMenu = Desserts.getDessertsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "dessert", sizeOfDessertMenu)-1;

        if (choice == 10) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu(); }
        else if (choice == 11) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedDessert = Desserts.getDessertsList().get(choice);
            double price = Desserts.getDessertsList().get(choice).getPrice();
            addSelectedDessertToCart(selectedDessert, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addDessertsToCart();
        }
    }

    static void addSelectedDessertToCart(Desserts selectedDessert, double price) {

        CartList.addToCartList(selectedDessert);
        CartList.addToCartValue(price);
    }


    public static void addIceCreamsToCart() {

        int sizeOfIceCreamsMenu = Desserts.getIceCreamsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "ice cream", sizeOfIceCreamsMenu)-1;

        if (choice == 6) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu();
        }
        else if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedIceCream = Desserts.getIceCreamsList().get(choice);
            double price = Desserts.getIceCreamsList().get(choice).getPrice();
            addSelectedDessertToCart(selectedIceCream, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.iceCreamCustomization();
        }
    }

    public static void addMcFlurryToCart() {

        int sizeOfIceMcFlurry = Desserts.getMcFlurryList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "McFlurry", sizeOfIceMcFlurry)-1;

        if (choice == 12) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu(); }
        else if (choice == 13) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedMcFlurry = Desserts.getMcFlurryList().get(choice);
            double price = Desserts.getMcFlurryList().get(choice).getPrice();
            addSelectedDessertToCart(selectedMcFlurry, price);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.mcFlurryCustomization();
        }
    }





    }



