package Finalization;

import java.util.*;

public class CartList {

    private static ArrayList<Object> cartList = new ArrayList<>();

//    private static Map<Object, Integer> cartLinkedHashMap = new LinkedHashMap<>();
    private static double cartValue = 00.00;

    public static void printCartList() {

        Map<Object, Integer> cartListToMap = new LinkedHashMap<>();

        //ADDING TO LINKEDHASHMAP
        for (Object obj : cartList) {
            if (cartListToMap.containsKey(obj)) {
                cartListToMap.put(obj, cartListToMap.get(obj) + 1);
            } else {
                cartListToMap.put(obj, 1);
            }
        }

        // PRINTING
        int i = 1; // incrementation display
        for (Map.Entry<Object, Integer> entry : cartListToMap.entrySet()) {

            System.out.print(i + ". "); // incrementation display
            System.out.println(entry.getValue() + " x " + entry.getKey());
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











