package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coffees {
    private String name;
    private double price;

    private static final ArrayList<Coffees> coffeesList = new ArrayList<>(Arrays.asList(
            new Coffees("Kawa Czarna", 8.90),
            new Coffees("Kawa z Mlekiem", 9.70),
            new Coffees("Flat White", 12.40),
            new Coffees("Caffe Latte", 12.40),
            new Coffees("Iced Latte", 14.40),
            new Coffees("Iced Carmel Latte", 15.30),
            new Coffees("Kawa Czarna", 8.90),
            new Coffees("Carmel Latte Macchiato", 16.60)));

    public Coffees(String name, double price) {
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