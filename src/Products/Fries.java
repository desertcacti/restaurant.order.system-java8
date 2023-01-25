package Products;

import Functional_Interfaces.MyPrinter;

import java.util.ArrayList;
import java.util.Arrays;

public class Fries{
    private String name;
    private double price;

    public static final ArrayList<Fries> friesList = new ArrayList<>(Arrays.asList(
            new Fries("Small fries", 9.40),
            new Fries("Medium Fries", 10.50),
            new Fries("Large fries", 10.90),
            new Fries("Chopped Potatoes", 9.90)));

    public Fries(String name, double price) {
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


    public static void displayFriesList() {
        MyPrinter.productListPrinter(friesList);
        System.out.println("\n5.Back");
        System.out.println("6.Finalize order");
    }



}
