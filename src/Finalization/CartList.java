package Finalization;

import Interfaces.MyScanner;
import Interfaces.getValidNumber;

import java.sql.SQLOutput;
import java.util.*;
public class CartList {
    private static ArrayList<String> onlyNamesCartList = new ArrayList<>();
    private static ArrayList<Object> cartList = new ArrayList<>();
    private static Map<String, Integer> cartListToMap = new LinkedHashMap<>();

    private static double cartValue = 00.00;

public static void changeArrayToMap() {

    //ADDING TO LINKEDHASHMAP
    for (Object obj : cartList) {

        String name = obj.toString();

        if (cartListToMap.containsKey(name)) {
            cartListToMap.put(name, cartListToMap.get(name) + 1);
        } else {
            cartListToMap.put(name, 1);
        }
    }
}
    public static void printCartList() {
        // PRINTING
        int i = 1; // incrementation display
        for (Map.Entry<String, Integer> entry : cartListToMap.entrySet()) {

            //Set the final name of Object displayed in Cart
            String nameOfObject = entry.getKey();
            int lengthOfObjectName = nameOfObject.length();
            int indexOfSymbol = nameOfObject.lastIndexOf("-");
            String finalName = nameOfObject.substring(0,indexOfSymbol-1);

            //Set the final price of Object/Objects displayed in Cart
            String priceAsString = nameOfObject.substring(indexOfSymbol+2, lengthOfObjectName-3);
            double priceAsDouble = Double.parseDouble(priceAsString.replace(',','.'));
            priceAsDouble = (entry.getValue()*priceAsDouble);

            //Display Cart
            System.out.print(i + ". "); // incrementation display
            System.out.println(entry.getValue() + " x " + finalName + " - " + String.format("%.2f", priceAsDouble) + " PLN");
            i++; // incrementation display

            //Adding names to ArrayList to push it later to next method.
            onlyNamesCartList.add(nameOfObject);
        }
        System.out.printf("\nTotal sum of your Cart is: %.2f PLN\n\n", CartList.getCartValue());
    }

    public static void cartManagingMethod() {

        System.out.println("Do you want to customize your cart? Y/N");
        String choice = MyScanner.myLineScanner();

        switch(choice) {

            case "Y":
                itemChosen();
                break;

            case "N":
                //finalFinalization();
                break;

            default:
                System.out.println("Please try again...");
                cartManagingMethod();
                break;
        }
    }

    private static void itemChosen() {

        System.out.println("Select position you want to customize: ");
        int sizeOfView = onlyNamesCartList.size();

        int indexOfElementName = getValidNumber.getValidNumber(MyScanner.getNewInstance(), sizeOfView)-1;

        String nameOfElement = onlyNamesCartList.get(indexOfElementName);

        System.out.println("Available options:\n\n1.Change quantity\n2.Delete from cart\n");

        int choice = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(),2);

        switch(choice) {

            case 1:
                //change quantity
                break;

            case 2:
                modifyBasketItem(cartListToMap,nameOfElement);
                onlyNamesCartList.removeAll(onlyNamesCartList);
                System.out.println("");
                printCartList();
                break;
        }
    }

    public static void modifyBasketItem(Map<String, Integer> basket, String key) {

        if (basket.containsKey(key)) {
            Integer value = basket.get(key);
            basket.put(key, value - 1);
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











