package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desserts {
    private String name;
   private double price;

    private static final ArrayList<Desserts> dessertsList = new ArrayList<>(Arrays.asList(

       new Desserts("Mango-passion fruit cake", 7.90),
       new Desserts("Apple cake", 7.90),
       new Desserts("Muffin with strawberries and white chocolate", 7.70),
       new Desserts("Muffin with chocolate", 7.70),
       new Desserts("Swirl with nougat", 7.70),
       new Desserts("Butter croissant", 6.60),
       new Desserts("Cocoa croissant", 7.70),
       new Desserts("Salted caramel cookie", 6.60),
       new Desserts("Oat cookie", 6.60),
       new Desserts("Cookie with chocolate pieces", 6.60),
       new Desserts("Cream ice cream with chocolate topping", 9.90),
       new Desserts("Cream ice cream with strawberry topping", 9.90),
       new Desserts("Cream ice cream with caramel topping", 9.90),
       new Desserts("Chocolate ice cream with chocolate topping", 9.90),
       new Desserts("Chocolate ice cream with strawberry topping", 9.90),
       new Desserts("Chocolate ice cream with caramel topping", 9.90),
       new Desserts("Cream McFlurry with Lion sprinkles", 11.50)));

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


    @Override
    public String toString () {
        return name +
                " - " +
                String.format("%.2f", price)
                + " PLN"
                ;
    }







}
