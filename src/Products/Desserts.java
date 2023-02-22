package Products;

import Interfaces.Add_To_Cart.AddDessertsToCart;
import Interfaces.Other.MyPrinter;
import Interfaces.Other.MyScanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Desserts {
    private String name;
   private double price;

    public static final ArrayList<Desserts> dessertsList = new ArrayList<>(Arrays.asList(
            /// desserts
            new Desserts("Mango-passion fruit cake", 7.90),
            new Desserts("Apple cake", 7.90),
            new Desserts("Strawberry white chocolate muffin", 7.70),
            new Desserts("Chocolate muffin", 7.70),
            new Desserts("Nougat swirl", 7.70),
            new Desserts("Butter croissant", 6.60),
            new Desserts("Cocoa croissant", 7.70),
            new Desserts("Salted caramel cookie", 6.60),
            new Desserts("Oatcake", 6.60),
            new Desserts("Chocolate chip cookie", 6.60)));

    public static final ArrayList<Desserts> iceCreamsList = new ArrayList<>(Arrays.asList(
            new Desserts("Chocolate ice cream", 9.90),
            new Desserts("Strawberry ice cream", 9.90),
            new Desserts("Caramel cream ice cream", 9.90),
            new Desserts("Chocolate ice cream with chocolate coating", 9.90),
            new Desserts("Chocolate ice cream with strawberry coating", 9.90),
            new Desserts("Chocolate ice cream with caramel coating", 9.90)));


    public static final ArrayList<Desserts> mcFlurryList = new ArrayList<>(Arrays.asList(
            /// Lion McFlurry
            new Desserts("Cream McFlurry with Lion sprinkles and strawberry coating", 11.50),
            new Desserts("Cream McFlurry with Lion sprinkles and chocolate coating", 11.50),
            new Desserts("Cream McFlurry with Lion sprinkles and caramel coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and strawberry coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and chocolate coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and caramel coating", 11.50),
            /// M&M's McFlurry
            new Desserts("Cream McFlurry with M&M's sprinkles and strawberry coating", 11.50),
            new Desserts("Cream McFlurry with M&M's sprinkles and chocolate coating", 11.50),
            new Desserts("Cream McFlurry with M&M's sprinkles and caramel coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and strawberry coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and chocolate coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and caramel coating", 11.50)));

    public Desserts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public static void displayPreDessertList() {

        System.out.println("Our desserts menu:\n\n1.Desserts\n2.Ice creams\n3.McFlurry\n\n4.Back");
    }


    public static void displayDessertsList() {

        System.out.println("Desserts menu:\n");
        MyPrinter.productListPrinter(dessertsList);
        System.out.println("\n11.Back");
        System.out.println("12.Finalize order\n");

    }


    public static void displayIceCreamList() {

        System.out.println("Ice cream menu:\n");
        MyPrinter.productListPrinter(iceCreamsList);
        System.out.println("\n7.Back");
        System.out.println("8.Finalize order\n");
    }


    public static void displayMcFlurryList() {

        System.out.println("McFlurry menu:\n");
        MyPrinter.productListPrinter(mcFlurryList);
        System.out.println("\n13.Back");
        System.out.println("14.Finalize order\n");
    }


    @Override
    public String toString () {

        return name +

                " - " +

                String.format("%.2f", price)

                + " PLN"
                ;

    }



}
