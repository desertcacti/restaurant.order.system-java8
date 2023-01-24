package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
    private String name;
    private double price;

    private static final ArrayList<Drinks> drinksList = new ArrayList<>(Arrays.asList(

            new Drinks("Still water", 8.70),
            new Drinks("Sparkling water", 8.70),
            new Drinks("Black Tea", 9.10),
            new Drinks("CocaCola", 7.50),
            new Drinks("CocaCola 0", 7.50),
            new Drinks("Fanta", 7.50),
            new Drinks("Sprite", 7.50),
            new Drinks("Lipton Ice Tea", 7.50),
            new Drinks("Chocolate Shake", 8.90),
            new Drinks("Vanilla Shake", 7.50),
            new Drinks("Strawberry Shake", 7.50)));

    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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