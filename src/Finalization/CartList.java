package Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.sql.SQLOutput;
import java.util.*;
public class CartList {

    private static double cartValue = 0.00;
    private static Map<String, Map<Double, Integer>> cartFinal = new LinkedHashMap<>();

    public static Map getCartList () {

        return cartFinal;

    }


    public static void addElementToCart(String nameWithPrice, Integer quantity) {

        String nameWithSinglePrice = nameWithPrice;
        String onlyName = getOnlyName(nameWithPrice);
        double onlySinglePrice = getOnlySinglePrice(nameWithSinglePrice);

        if (cartFinal.containsKey(onlyName)) {

            Map<Double, Integer> itemData = cartFinal.get(onlyName);
            int oldQuantity = itemData.get(onlySinglePrice);
            itemData.put(onlySinglePrice, oldQuantity + quantity);
            cartValue += onlySinglePrice;

        } else {

            Map<Double, Integer> itemData = new HashMap<>();
            itemData.put(onlySinglePrice, quantity);
            cartFinal.put(onlyName, itemData);
            cartValue += onlySinglePrice;
        }
    }

    public static void printCartList() {

        int enumeration = 1;

        System.out.println("\nElements in your Cart:");

        for (String itemName : cartFinal.keySet()) {

            Map<Double, Integer> itemDetails = cartFinal.get(itemName);

            for (Double singlePrice : itemDetails.keySet()) {
                int quantity = itemDetails.get(singlePrice);
                System.out.println(enumeration + ". " + quantity + " x " + itemName + " - " + String.format("%.2f",(quantity * singlePrice)) + " PLN");
                enumeration++;
            }
        }

        System.out.printf("\nTotal sum of your Cart is: %.2f PLN\n\n", CartList.getCartValue());

    }



    public static void cartCustomizationMethod() {

        System.out.println("Do you want to customize your cart? Y/N");
        String choice = MyScanner.myLineScanner();

        switch(choice) {

            case "Y":
                System.out.println("\nAvailable options:\n\nA - Add new item\nD - Delete position\nQ - Quantity change\nP - Personalize\nF - Finalize order\n");
                availableCustomizationOptions();
                break;


            case "N":
                 Finalization.orderSettlement();
                 break;

            default:
                System.out.println("Please try again...");
                cartCustomizationMethod();
                break;
        }
    }


    public static String getSelectedPosition() {

        int currentPosition = 0;
        int sizeOfCart = cartFinal.size();
        String selectedKey = null;

        System.out.println("Select position you want to customize: ");

        int selectedPosition = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(), sizeOfCart);

        for (String key : cartFinal.keySet()) {
            if (currentPosition == selectedPosition - 1) { // account for 0-based indexing
                selectedKey = key;
                break;
            }
            currentPosition++;
        }

        return selectedKey;

    }


    private static void availableCustomizationOptions(){

        String selectedPositionOfOuterMapKey = "";

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
                selectedPositionOfOuterMapKey = getSelectedPosition();
                removePositionFromBasket(cartFinal, selectedPositionOfOuterMapKey);
                Finalization.finalizationOfOrder();
                break;

            case "Q":
                //change quantity of selected item
                selectedPositionOfOuterMapKey = getSelectedPosition();
                changeQuantityMethod(selectedPositionOfOuterMapKey);
                Finalization.finalizationOfOrder();
                break;

            case "P":
                ///
                ///implement method of personalization.

                break;

            case "F":
                Finalization.orderSettlement();
                break;


            default:
                System.out.println("Please try again...");
                availableCustomizationOptions();
                break;

        }
    }


    public static void changeQuantityMethod(String positionKey) {

        System.out.print("\nEnter quantity: ");
        int desiredQuantity = MyScanner.getNewInstance().nextInt();

        if(desiredQuantity < 1 || desiredQuantity > 12) {
            System.out.println("\nQuantity cannot be below 1 or greater than 12");
            changeQuantityMethod(positionKey);

        } else {
            modifyBasketItem(positionKey, desiredQuantity);
            printCartList();
        }
    }

    private static void modifyBasketItem(String positionKey, int desiredQuantity) {

        Double selectedKey = 0.00;
        Integer currentQuantity = 0;
        int difference = 0;


        if (cartFinal.containsKey(positionKey)) {

            Map<Double, Integer> actualPositionDetails = cartFinal.get(positionKey);

            for (Double key : actualPositionDetails.keySet()) {
                selectedKey = key;
                currentQuantity = actualPositionDetails.get(selectedKey);
                break;
            }

            difference = Math.abs(desiredQuantity - currentQuantity);

            if (desiredQuantity > currentQuantity) {

                actualPositionDetails.put(selectedKey, currentQuantity + difference);
                cartValue += (difference * selectedKey);

            }  else if (desiredQuantity == currentQuantity) {
                ////empty - do nothing
            } else {
                actualPositionDetails.put(selectedKey, currentQuantity - difference);
                cartValue -= (difference * selectedKey);

            }
        }
    }


    private static void removePositionFromBasket(Map<String,Map<Double,Integer>> cartFinal, String keyOfElementSelected) {

        Double selectedKey = 0.00;
        Integer currentQuantity = 0;

        if (cartFinal.containsKey(keyOfElementSelected)) {

            Map<Double, Integer> actualPositionDetails = cartFinal.get(keyOfElementSelected);

            for (Double key : actualPositionDetails.keySet()) {
                selectedKey = key;
                currentQuantity = actualPositionDetails.get(selectedKey);
                break;
            }
        }
        cartValue -= currentQuantity*selectedKey;
        cartFinal.remove(keyOfElementSelected);
    }


    private static String getOnlyName(String nameWithPrice) {

        int indexOfSymbol = nameWithPrice.lastIndexOf("-");
        String singleName = nameWithPrice.substring(0,indexOfSymbol-1);

        return  singleName;


    }

    private static double getOnlySinglePrice(String nameWithPrice) {


        int length = nameWithPrice.length();
        int indexOfSymbol = nameWithPrice.lastIndexOf("-");
        String priceAsString = nameWithPrice.substring(indexOfSymbol+2, length-3);
        double singlePrice = Double.parseDouble(priceAsString.replace(',','.'));

        return  singlePrice;
    }



    public static void addToCartValue (double price) {

       cartValue += price;
    }


    public static  double getCartValue() {
        return cartValue;
    }


}











