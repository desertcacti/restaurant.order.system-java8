package Products;

import Customization.DrinksCustomization;
import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;

public class Drinks {
    private String name;
    private double price;

    private static final ArrayList<Drinks> drinksList = new ArrayList<>(Arrays.asList(

            new Drinks("Still water", 8.70),
            new Drinks("Sparkling water", 8.70),
            new Drinks("Tea", 9.10),
            new Drinks("Lipton Ice Tea", 7.50),
            new Drinks("CocaCola", 7.50),
            new Drinks("CocaCola Zero", 7.50),
            new Drinks("Fanta", 7.50),
            new Drinks("Sprite", 7.50),
            new Drinks("Chocolate Shake", 8.90),
            new Drinks("Vanilla shake", 7.50),
            new Drinks("Strawberry Shake", 7.50)));

    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public static void displayDrinksMenu() {

        System.out.println("\nDrinks menu:\n");
        MyPrinter.productListPrinter(drinksList);
        System.out.println("\n12.Back");
        System.out.println("13.Finalize order\n");
    }


    public static ArrayList<Drinks> getDrinksList() {
        return drinksList;


    }

    public static void addDrinksToCart() {

        int sizeOfDrinksMenu = Drinks.getDrinksList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(),"drinks", sizeOfDrinksMenu)-1;

        if (choice == 11) { SystemStart.Start();}
        else if (choice == 12) { Finalization.finalizationOfOrder();}

        else {
            Drinks selectedDrink = Drinks.getDrinksList().get(choice);
            double price = Drinks.getDrinksList().get(choice).getPrice();
            String nameWithPrice = selectedDrink.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DrinksCustomization.drinksCustomization();
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