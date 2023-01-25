package FinalizationOrder;

import Functional_Interfaces.MyPrinter;

import java.util.ArrayList;

public class CartList {


    public static ArrayList<Object> cartList = new ArrayList<>();


    public CartList(ArrayList<Object> cartList) {
        this.cartList = cartList;
    }


    public ArrayList<Object> getCartList() {
        return cartList;
    }



   public static void printCartList() {
       MyPrinter.productListPrinter(cartList);
   }






}
