package Products;

import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;

public class Nuggets {
    private String name;
    private double price;

    private static final ArrayList<Nuggets> nuggetsList = new ArrayList<>(Arrays.asList(
            new Nuggets("Six McNuggets", 16.00),
            new Nuggets("Nine McNuggets", 18.80),
            new Nuggets("Twenty McNuggets", 30.30),
            new Nuggets("Three Chicken Tenders", 16.70),
            new Nuggets("Five Chicken Tenders", 21.30),
            new Nuggets("ChickenBox", 43.40)));

    public Nuggets(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void displayNuggetsMenu() {

        System.out.println("\nNuggets menu:\n");
        MyPrinter.productListPrinter(nuggetsList);
        System.out.println("\n7.Back");
        System.out.println("8.Finalize order\n");
    }

    public static ArrayList<Nuggets> getNuggetsList() {
        return nuggetsList;
    }


    public static void addNuggetsToCart() {

        int sizeOfNuggetsMenu = Nuggets.getNuggetsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "nuggets", sizeOfNuggetsMenu)-1;

        if (choice == 6) { SystemStart.Start(); }
        else if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Nuggets selectedNuggets = Nuggets.getNuggetsList().get(choice);
            double price = Nuggets.getNuggetsList().get(choice).getPrice();
            String nameWithPrice = selectedNuggets.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addNuggetsToCart();
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




}


