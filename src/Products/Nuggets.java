package Products;

import Interfaces.Other.MyPrinter;

import java.util.ArrayList;
import java.util.Arrays;

public class Nuggets {
    private String name;
    private double price;

    public static final ArrayList<Nuggets> nuggetsList = new ArrayList<>(Arrays.asList(
            new Nuggets("Six McNuggets", 16.00),
            new Nuggets("Nine McNuggets", 18.80),
            new Nuggets("Twenty McNuggets", 30.30),
            new Nuggets("Three Chicken Tenders", 16.70),
            new Nuggets("Five Chicken Tenders", 21.30),
            new Nuggets("ChickenBox", 43.40)));

    public Nuggets(String name, double price) {
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


    public static void displayNuggetsList() {

        System.out.println("\nNuggets menu:\n");
        MyPrinter.productListPrinter(nuggetsList);
        System.out.println("\n7.Back");
        System.out.println("8.Finalize order");
    }








}


