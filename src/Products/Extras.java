package Products;

import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;




public class Extras {
    private String name;
    private double price;

    private static final ArrayList<Extras> extrasList = new ArrayList<>(Arrays.asList(
            new Extras("Olive oil", 1.50),
            new Extras("Ketchup", 1.50),
            new Extras("Garlic sauce", 2.00),
            new Extras("1000 Island sauce", 2.00),
            new Extras("Mustard sauce", 2.00),
            new Extras("Barbeque sauce", 2.00),
            new Extras("Sweet and sour sauce", 2.00),
            new Extras("Cream sauce", 2.00),
            new Extras("Dill sauce", 2.00),
            new Extras("Vinaigrette sauce", 2.00)));

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



    public static void displayExtrasMenu() {

        System.out.println("\nExtras menu:\n");
        MyPrinter.productListPrinter(extrasList);
        System.out.println("\n11.Back");
        System.out.println("12.Finalize order\n");
    }

    public static ArrayList<Extras> getExtrasList() {
        return extrasList;
    }


    public static void addExtrasToCart() {

        int sizeOfExtrasMenu = Extras.getExtrasList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "extras", sizeOfExtrasMenu)-1;

        if (choice == 10) { SystemStart.Start(); }
        else if (choice == 11) { Finalization.finalizationOfOrder(); }

        else {
            Extras selectedExtras = Extras.getExtrasList().get(choice);
            double price = Extras.getExtrasList().get(choice).getPrice();
            String nameWithPrice = selectedExtras.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addExtrasToCart();
        }
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