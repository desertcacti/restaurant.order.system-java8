package Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.sql.SQLOutput;
import java.util.*;
public class CartList {
    private static ArrayList<String> arrayListViewOfProductsInCart = new ArrayList<>();
    private static ArrayList<Object> cartList = new ArrayList<>();
    private static Map<String, Integer> cartMap = new LinkedHashMap<>();
    private static double cartValue = 00.00;

public static void changeArrayListToLinkedHashMap() {

    for (Object obj : cartList) {

        String name = obj.toString();

        if (cartMap.containsKey(name)) {
            cartMap.put(name, cartMap.get(name) + 1);
        } else {
            cartMap.put(name, 1);
        }
    }
}


    private static String getOnlyNameWithoutPrice(Map.Entry<String, Integer> entry) {

        String initialNameOfObject = entry.getKey();
        int lengthOfObjectName = initialNameOfObject.length();
        int indexOfSymbol = initialNameOfObject.lastIndexOf("-");
        String finalName = initialNameOfObject.substring(0,indexOfSymbol-1);

        return  finalName;

    }


    private static double getPositionSummarizePrice(String itemNameWithPrice, Map.Entry<String, Integer> entry) {

        int length = itemNameWithPrice.length();
        int indexOfSymbol = itemNameWithPrice.lastIndexOf("-");
        String priceAsString = itemNameWithPrice.substring(indexOfSymbol+2, length-3);
        double summarizePriceOfPosition = Double.parseDouble(priceAsString.replace(',','.'));
        summarizePriceOfPosition = (entry.getValue()*summarizePriceOfPosition);

        return summarizePriceOfPosition;

    }


    public static void printCartList() {

        int i = 1;
        String itemNameWithPrice = "";
        String itemNameWithoutPrice = "";
        double cartPositionFullPrice = 0;

        System.out.println("\nElements in your Cart:");

        for (Map.Entry<String, Integer> entry : cartMap.entrySet()) {

            itemNameWithPrice = entry.getKey();
            itemNameWithoutPrice = getOnlyNameWithoutPrice(entry);
            cartPositionFullPrice = getPositionSummarizePrice(itemNameWithPrice, entry);

            //Printing cartList with summarize prices
            System.out.print(i + ". ");
            System.out.println(entry.getValue() + " x " + itemNameWithoutPrice + " - " + String.format("%.2f", cartPositionFullPrice) + " PLN");
            i++;

            //Create arrayListView
            arrayListViewOfProductsInCart.add(itemNameWithPrice);
        }
        System.out.printf("\nTotal sum of your Cart is: %.2f PLN", CartList.getCartValue());
        System.out.println("\n");
        cartCustomizationMethod();
    }
    public static void cartCustomizationMethod() {

        System.out.println("Do you want to customize your cart? Y/N");
        String choice = MyScanner.myLineScanner();

        switch(choice) {

            case "Y":
                selectPositionToCustomize();
                break;


            case "N":
                //final finalization method // settlment method
                break;

            default:
                System.out.println("Please try again...");
                cartCustomizationMethod();
                break;
        }
    }

    private static String getOnlyNameWithoutPrice(int index) {

        String selectedName = arrayListViewOfProductsInCart.get(index);

        return selectedName;

    }

    private static double getPriceOfSelectedItem(String objectNameSelected) {

        int indexOfSymbol = objectNameSelected.lastIndexOf("-");
        int objectNameLength = objectNameSelected.length();
        String priceAsString = objectNameSelected.substring(indexOfSymbol + 2, objectNameLength - 3);
        double priceOfElementChosen = Double.parseDouble(priceAsString.replace(',', '.'));

        return priceOfElementChosen;
    }



    private static void selectPositionToCustomize() {

        int sizeOfView = arrayListViewOfProductsInCart.size();

        System.out.println("Select position you want to customize: ");

        int indexOfElementName = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(), sizeOfView) - 1;

        String objectNameSelected = getOnlyNameWithoutPrice(indexOfElementName);
        double priceOfElementChosen = getPriceOfSelectedItem(objectNameSelected);


//        int currentQuantityOfSelectedItem = cartMap.get(objectNameSelected);
        System.out.println("\nAvailable options:\n\nD - Delete position\nQ - Quantity change\nP - Personalize\nF - Finalize order\n");
        availableCustomizationOptions(objectNameSelected, priceOfElementChosen, indexOfElementName);

    }

        private static void availableCustomizationOptions(String objectNameSelected, double priceOfElementChosen, int indexOfElementName ){


        System.out.print("Enter choice: ");
        String choice = MyScanner.getNewInstance().nextLine();
        System.out.println("");

        switch(choice) {

            case "A":
                //add new position to menu
                SystemStart.Start();
                break;

            case "D":
                //delete position from cart
                removePositionFromBasket(cartMap,objectNameSelected, priceOfElementChosen, indexOfElementName);
                printCartList();
                break;

            case "Q":
                //change quantity of selected item
                changeQuantityMethod(objectNameSelected, priceOfElementChosen);
                break;

            case "P":

                break;

            case "F":

                break;


            default:
                System.out.println("Please try again...");
                availableCustomizationOptions(objectNameSelected,priceOfElementChosen, indexOfElementName);
                break;

        }
    }

    //CASE Q
    public static void changeQuantityMethod(String nameOfElementChosen, double priceOfElementChosen) {

        System.out.print("Enter quantity: ");
        int desiredQuantity = MyScanner.getNewInstance().nextInt();

        if(desiredQuantity < 1 || desiredQuantity > 12) {
            System.out.println("\nQuantity cannot be below 1 or greater than 12");
            changeQuantityMethod(nameOfElementChosen, priceOfElementChosen);

        } else {
            modifyBasketItem(cartMap,nameOfElementChosen, desiredQuantity, priceOfElementChosen);
            printCartList();
        }
    }

    private static void modifyBasketItem(Map<String, Integer> basket, String key, int desiredQuantity, double priceOfChosenElement) {

        if (basket.containsKey(key)) {
            Integer quantityOfItemInCart = basket.get(key);

            if (desiredQuantity > quantityOfItemInCart) {
                int difference = desiredQuantity - quantityOfItemInCart;
                basket.put(key, quantityOfItemInCart + difference);
                cartValue += (difference * priceOfChosenElement);

            } else if (desiredQuantity == quantityOfItemInCart) {
                ////empty - do nothing
            } else {
                int difference = quantityOfItemInCart - desiredQuantity;
                basket.put(key, quantityOfItemInCart - difference);
                cartValue -= (difference * priceOfChosenElement);
            }
        }
    }

     ////D CASE
    private static void removePositionFromBasket(Map<String, Integer> cartMap, String key, double priceOfElementChosen, int indexOfPositionChosen) {

        if (cartMap.containsKey(key)) {

            //decrease cartValue
            Integer quantityOfPosition = cartMap.get(key);
            double finalPrice = quantityOfPosition*priceOfElementChosen;

            cartValue -= finalPrice;

            // remove from cart
            arrayListViewOfProductsInCart.remove(indexOfPositionChosen);
            cartMap.remove(key);
        }
    }



    public static void addToCartValue (double price) {

       cartValue += price;
    }

    public static void addToCart(Object o, double price) {
        cartList.add(o);
        cartValue += price;
    }


    public static  double getCartValue() {
        return cartValue;
    }

    public static ArrayList getCartList () {
        return cartList;
    }

    public static void addToCartList(Object o) {

        cartList.add(o);
    }






}











