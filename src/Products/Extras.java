package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Extras {
    private String name;
    private double price;

    private static final ArrayList<Extras> extrasList = new ArrayList<>(Arrays.asList(
            new Extras("Oliwa z oliwek", 1.50),
            new Extras("Ketchup", 1.50),
            new Extras("Sos koperkowy", 2.00),
            new Extras("Sos 1000 wysp", 2.00),
            new Extras("Sos Vinegret", 2.00),
            new Extras("Sos słodko-kwaśny", 2.00),
            new Extras("Sos Barbeque", 2.00),
            new Extras("Sos Musztardowy", 2.00),
            new Extras("Sos śmietanowy", 2.00),
            new Extras("Sos czosnkowy", 2.00)));

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