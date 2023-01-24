package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desserts {
    private String name;
   private double price;

    private static final ArrayList<Desserts> dessertsList = new ArrayList<>(Arrays.asList(

            new Desserts("Mango-passion fruit cake", 7.90),
            new Desserts("Apple Cake", 7.90),
            new Desserts("Strawberry White Chocolate Muffin", 7.70),
            new Desserts("Chocolate Muffin", 7.70),
            new Desserts("Nougat Swirl", 7.70),
            new Desserts("Butter Croassant", 6.60),
            new Desserts("Cocoa Croassant", 7.70),
            new Desserts("Salted Caramel Cookie", 6.60),
            new Desserts("Oatcake", 6.60),
            new Desserts("Chocolate chip cookie", 6.60),
            new Desserts("Chocolate ice Cream", 9.90),
            new Desserts("Strawberry ice cream", 9.90),
            new Desserts("Caramel cream ice Cream", 9.90),
            new Desserts("Chocolate ice cream with chocolate topping", 9.90),
            new Desserts("Chocolate ice Cream with strawberry topping", 9.90),
            new Desserts("Chocolate ice cream with caramel coating", 9.90),
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
