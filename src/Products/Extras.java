package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Extras {
    private String name;
    private double price;

    private static final ArrayList<Extras> extrasList = new ArrayList<>(Arrays.asList(
            new Extras("Olive oil", 1.50),
            new Extras("Ketchup", 1.50),
            new Extras("Sweet and Sour sauce", 2.00),
            new Extras("Barbeque sauce", 2.00),
            new Extras("Mustard sauce", 2.00),
            new Extras("Cream sauce", 2.00),
            new Extras("Garlic sauce", 2.00),
            new Extras("Dill sauce", 2.00),
            new Extras("1000 Island sauce", 2.00),
            new Extras("Sos Vinegret", 2.00)));


    public Extras(String name, double price) {
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
    public String toString() {
        return name +
                " - " +
                String.format("%.2f", price)
                + " PLN"
                ;
    }








}