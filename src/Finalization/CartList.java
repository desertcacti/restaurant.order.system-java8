package Finalization;

import java.util.*;

public class CartList {


    private static ArrayList<Object> cartList = new ArrayList<>();
    private static double cartValue = 00.00;

//    public static void printCartList() {
//
//        Map<Object, Integer> cartListToMap = new LinkedHashMap<>();
//
//        //ADDING TO LINKEDHASHMAP
//        for (Object obj : cartList) {
//            if (cartListToMap.containsKey(obj)) {
//                cartListToMap.put(obj, cartListToMap.get(obj) + 1);
//            } else {
//                cartListToMap.put(obj, 1);
//            }
//        }
//
//        // PRINTING
//        int i = 1; // incrementation display
//        for (Map.Entry<Object, Integer> entry : cartListToMap.entrySet()) {
//            System.out.print(i + ". "); // incrementation display
//            System.out.println(entry.getValue() + " x " + entry.getKey());
//            i++; // incrementation display
//        }
//    }
//public static void printCartList() {
//
//    Map<String, Integer> cartListToMap = new LinkedHashMap<>();
//    int objectNameLength;
//    String numberString;
//    double price = 0;
//
//    //ADDING TO LINKEDHASHMAP
//
//    for (Object obj : cartList) {
//        String name = obj.toString();
////        name = name.substring(0,name.length()-8);
//
//        if (cartListToMap.containsKey(name)) {
//            cartListToMap.put(name, cartListToMap.get(name) + 1);
//        } else {
//            cartListToMap.put(name, 1);
//        }
//
////        objectNameLength = name.length();
////        numberString = name.substring(objectNameLength-9, objectNameLength-4);
////        price = Double.parseDouble(numberString.replace(",","."));
//
//
//
//    }
//    // PRINTING
//    int i = 1; // incrementation display
//
//    for (Map.Entry<String, Integer> entry : cartListToMap.entrySet()) {
//
////
////        String name1 = entry.getKey();
////        name1 = name1.substring(0,name1.length()-9);
////        System.out.println(price);
//
//        System.out.print(i + ". "); // incrementation display
//        System.out.println(entry.getValue() + " x " + entry.getKey());
//        i++; // incrementation display
//    }
//}


//public static void printCartList() {
//
//    Map<String, Integer> cartListToMap = new LinkedHashMap<>();
//
//    //ADDING TO LINKEDHASHMAP
//    for (Object obj : cartList) {
//        String name = obj.toString();
//        if (cartListToMap.containsKey(name)) {
//            cartListToMap.put(name, cartListToMap.get(name) + 1);
//        } else {
//            cartListToMap.put(name, 1);
//        }
//    }
//    // PRINTING
//    int i = 1; // incrementation display
//    for (Map.Entry<String, Integer> entry : cartListToMap.entrySet()) {
//        System.out.print(i + ". "); // incrementation display
//        System.out.println(entry.getValue() + " x " + entry.getKey());
//        i++; // incrementation display
//    }
//}

public static void printCartList() {

    Map<String, Integer> cartListToMap = new LinkedHashMap<>();

    //ADDING TO LINKEDHASHMAP
    for (Object obj : cartList) {
        String name = obj.toString();
        if (cartListToMap.containsKey(name)) {
            cartListToMap.put(name, cartListToMap.get(name) + 1);
        } else {
            cartListToMap.put(name, 1);
        }
    }

    // PRINTING
    int i = 1; // incrementation display
    for (Map.Entry<String, Integer> entry : cartListToMap.entrySet()) {

        //Set the final name of Object displayed in Cart
        String nameOfObject = entry.getKey();
        int lengthOfObjectName = nameOfObject.length();
        int indexOfSymbol = nameOfObject.lastIndexOf("-");
        String finalName = nameOfObject.substring(0,indexOfSymbol);

        //Set the final price of Object/Objects displayed in Cart
        String priceAsString = nameOfObject.substring(indexOfSymbol+2, lengthOfObjectName-3);
        double priceAsDouble = Double.parseDouble(priceAsString.replace(',','.'));
        priceAsDouble = (entry.getValue()*priceAsDouble);

        //Display Cart
        System.out.print(i + ". "); // incrementation display
        System.out.println(entry.getValue() + " x " + finalName + " - " + String.format("%.2f", priceAsDouble) + " PLN");
        i++; // incrementation display
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











