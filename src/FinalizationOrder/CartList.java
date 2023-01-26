package FinalizationOrder;

import java.util.*;

public class CartList {

    private static ArrayList<Object> cartList = new ArrayList<>();
    private static double cartValue = 00.00;

    public static void printCartList() {

        Map<Object, Integer> cartListToMap = new HashMap<>();

        for (Object obj : cartList) {
            if (cartListToMap.containsKey(obj)) {
                cartListToMap.put(obj, cartListToMap.get(obj) + 1);
            } else {
                cartListToMap.put(obj, 1);
            }
        }

        for (Map.Entry<Object, Integer> entry : cartListToMap.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());

        }
    }


   public static void addToCartValue (double price) {

       cartValue += price;
    }


    public static double getCartValue() {
        return cartValue;
    }

    public static ArrayList getCartList () {
        return cartList;
    }



}











