package Products;

import Customization.WrapsCustomization;
import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;
public class Wraps {
    private String name;
    private double price;
    private static final ArrayList<Wraps> wrapsList = new ArrayList<>(Arrays.asList(
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



    public static void displayWrapsMenu() {

        System.out.println("\nWraps menu:\n");
        MyPrinter.productListPrinter(wrapsList);
        System.out.println("\n5.Back");
        System.out.println("6.Finalize order\n");
    }


    public static ArrayList<Wraps> getWrapsList() {
        return wrapsList;
    }


    public static void addWrapToCart() {

        int sizeOfWrapsMenu = Wraps.getWrapsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "wrap", sizeOfWrapsMenu)-1;

        if (choice == 4) { SystemStart.Start(); }
        else if (choice == 5) { Finalization.finalizationOfOrder(); }

        else {
            Wraps selectedWraps = Wraps.getWrapsList().get(choice);
            double price = Wraps.getWrapsList().get(choice).getPrice();
            String nameWithPrice = selectedWraps.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            WrapsCustomization.wrapsCustomization();
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





