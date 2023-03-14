package Products;

import Interfaces.MyPrinter;

import java.util.ArrayList;
import java.util.Arrays;

public class Coffees {
    private String name;
    private double price;

    private static final ArrayList<Coffees> coffeesList = new ArrayList<>(Arrays.asList(

            new Coffees("Black Coffee", 8.90),
            new Coffees("Coffee with milk", 9.70),
            new Coffees("Flat White", 12.40),
            new Coffees("Caffe Latte", 12.40),
            new Coffees("Iced Latte", 14.40),
            new Coffees("Iced Caramel Latte", 15.30),
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

    public static ArrayList<Coffees> getCoffeesList() {
        return coffeesList;
    }

    @Override
    public String toString () {

        return name +
                " - " +
                String.format("%.2f", price)
                + " PLN"
                ;

    }


    public static void displayCoffeesMenu() {

        System.out.println("\nCoffees menu:\n");
        MyPrinter.productListPrinter(coffeesList);
        System.out.println("\n8.Back");
        System.out.println("9.Finalize order\n");
    }




}