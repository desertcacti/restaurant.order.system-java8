package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Wraps {
    private String name;
    private double price;
    private static final ArrayList<Wraps> wraps = new ArrayList<>(Arrays.asList(
            new Wraps("McWrap Veggie", 18.60),
            new Wraps("McWrap Crispy Classic", 19.90),
            new Wraps("McWrap Crispy Bacon Deluxe", 20.50),
            new Wraps("McWrap Supreme Chicken Sweet & Spicy", 22.70)));


    public Wraps(String name, double price) {
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





