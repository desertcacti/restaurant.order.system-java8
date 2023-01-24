package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fries{
    private String name;
    private double price;

    private static final ArrayList<Fries> friesList = new ArrayList<>(Arrays.asList(
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






}
