package Products;
import Interfaces.Other.MyPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Burger  {
    private String name;
    private double price;

   private static final ArrayList<Burger> burgersList = new ArrayList<>(Arrays.asList(
            new Burger("Jalapeno Burger", 6.50),
            new Burger("Hamburger", 5.90),
            new Burger("Chikker", 7.50),
            new Burger("Cheeseburger", 6.50),
            new Burger("McDouble", 9.90),
            new Burger("McChicken", 16.70),
            new Burger("Veggie Burger", 18.60),
            new Burger("Wieśniak", 19.10),
            new Burger( "McRoyal", 19.10),
            new Burger( "Big Mac", 19.40),
            new Burger("Supreme Chicken Sweet & Spicy Burger", 22.70)));



    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public static void displayBurgerMenu() {

        System.out.println("\nBurgers menu:\n");
        MyPrinter.productListPrinter(burgersList);
        System.out.println("\n12.Back");
        System.out.println("13.Finalize order\n");
    }

    public static ArrayList<Burger> getBurgerList() {
        return burgersList;
    }


    @Override
    public String toString() {

        return name +
                " - " +
                String.format("%.2f", price)
                + " PLN"
                ;
    }
}