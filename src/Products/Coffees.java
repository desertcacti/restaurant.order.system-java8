package Products;

import Customization.CoffeesCustomization;
import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;

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


    public static void addCoffeesToCart() {

        int sizeOfCoffeesMenu = Coffees.getCoffeesList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "coffee", sizeOfCoffeesMenu) - 1;

        if (choice == 7) { SystemStart.Start(); }
        else if (choice == 8) { Finalization.finalizationOfOrder();}

        else {
            Coffees selectedCoffee = Coffees.getCoffeesList().get(choice);
            double price = Coffees.getCoffeesList().get(choice).getPrice();
            String nameWithPrice = selectedCoffee.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            CoffeesCustomization.coffeesCustomization();
        }
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