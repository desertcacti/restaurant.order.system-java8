package Products;

import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;
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

    public static void displayFriesMenu() {

        System.out.println("\nFries menu:\n");
        MyPrinter.productListPrinter(friesList);
        System.out.println("\n5.Back");
        System.out.println("6.Finalize order\n");
    }



    public static ArrayList<Fries> getFriesList() {
        return friesList;
    }

    public static void addFriesToCart() {

        int sizeOfFriesMenu = Fries.getFriesList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "fries", sizeOfFriesMenu)-1;

        if (choice == 4) { SystemStart.Start(); }
        else if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Fries selectedFries = Fries.getFriesList().get(choice);
            double price = Fries.getFriesList().get(choice).getPrice();
            String nameWithPrice = selectedFries.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addFriesToCart();
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
