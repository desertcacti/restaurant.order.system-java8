package Products;

import Customization.DessertsCustomization;
import Finalization.Finalization;
import Interfaces.MyPrinter;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;

import java.util.ArrayList;
import java.util.Arrays;
import Finalization.CartList;

public class Desserts {
    private String name;
   private double price;

    private static final ArrayList<Desserts> dessertsList = new ArrayList<>(Arrays.asList(
            /// desserts
            new Desserts("Mango-passion fruit cake", 7.90),
            new Desserts("Apple cake", 7.90),
            new Desserts("Strawberry white chocolate muffin", 7.70),
            new Desserts("Chocolate muffin", 7.70),
            new Desserts("Nougat swirl", 7.70),
            new Desserts("Butter croissant", 6.60),
            new Desserts("Cocoa croissant", 7.70),
            new Desserts("Salted caramel cookie", 6.60),
            new Desserts("Oatcake", 6.60),
            new Desserts("Chocolate chip cookie", 6.60)));

    private static final ArrayList<Desserts> iceCreamsList = new ArrayList<>(Arrays.asList(
            new Desserts("Chocolate ice cream", 9.90),
            new Desserts("Strawberry ice cream", 9.90),
            new Desserts("Caramel cream ice cream", 9.90),
            new Desserts("Chocolate ice cream with chocolate coating", 9.90),
            new Desserts("Chocolate ice cream with strawberry coating", 9.90),
            new Desserts("Chocolate ice cream with caramel coating", 9.90)));


    private static final ArrayList<Desserts> mcFlurryList = new ArrayList<>(Arrays.asList(
            /// Lion McFlurry
            new Desserts("Cream McFlurry with Lion sprinkles and strawberry coating", 11.50),
            new Desserts("Cream McFlurry with Lion sprinkles and chocolate coating", 11.50),
            new Desserts("Cream McFlurry with Lion sprinkles and caramel coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and strawberry coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and chocolate coating", 11.50),
            new Desserts("Chocolate McFlurry with Lion sprinkles and caramel coating", 11.50),
            /// M&M's McFlurry
            new Desserts("Cream McFlurry with M&M's sprinkles and strawberry coating", 11.50),
            new Desserts("Cream McFlurry with M&M's sprinkles and chocolate coating", 11.50),
            new Desserts("Cream McFlurry with M&M's sprinkles and caramel coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and strawberry coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and chocolate coating", 11.50),
            new Desserts("Chocolate McFlurry with M&M's sprinkles and caramel coating", 11.50)));

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




    public static void displayPreDessertMenu() {

        System.out.println("\nOur desserts menu:\n\n1.Desserts\n2.Ice creams\n3.McFlurry\n\n4.Back\n");
    }


    public static void displayDessertsMenu() {

        System.out.println("\nDesserts menu:\n");
        MyPrinter.productListPrinter(dessertsList);
        System.out.println("\n11.Back");
        System.out.println("12.Finalize order\n");

    }


    public static void displayIceCreamMenu() {

        System.out.println("\nIce cream menu:\n");
        MyPrinter.productListPrinter(iceCreamsList);
        System.out.println("\n7.Back");
        System.out.println("8.Finalize order\n");
    }


    public static void displayMcFlurryMenu() {

        System.out.println("\nMcFlurry menu:\n");
        MyPrinter.productListPrinter(mcFlurryList);
        System.out.println("\n13.Back");
        System.out.println("14.Finalize order\n");
    }

    public static ArrayList<Desserts> getDessertsList() {
        return dessertsList;
    }

    public static ArrayList<Desserts> getIceCreamsList() {
        return iceCreamsList;
    }

    public static ArrayList<Desserts> getMcFlurryList() {
        return mcFlurryList;
    }



    public static void displayDessertsMainMenu() {

        int choice = getValidNumber.getValidNumber(MyScanner.getNewInstance(),4);

        switch (choice) {

            case 1:
                Desserts.displayDessertsMenu();
                addDessertsToCart();
                break;

            case 2:
                Desserts.displayIceCreamMenu();
                addIceCreamsToCart();
                break;

            case 3:
                Desserts.displayMcFlurryMenu();
                addMcFlurryToCart();
                break;

            case 4:
                SystemStart.Start();
                break;

            default:
                System.out.println("Wrong number selected. Please try again.");
                displayDessertsMainMenu();
                break;
        }
    }


    public static void addDessertsToCart() {

        int sizeOfDessertMenu = Desserts.getDessertsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "dessert", sizeOfDessertMenu)-1;

        if (choice == 10) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu(); }
        else if (choice == 11) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedDessert = Desserts.getDessertsList().get(choice);
            double price = Desserts.getDessertsList().get(choice).getPrice();
            String nameWithPrice = selectedDessert.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            addDessertsToCart();

        }
    }


    public static void addIceCreamsToCart() {

        int sizeOfIceCreamsMenu = Desserts.getIceCreamsList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "ice cream", sizeOfIceCreamsMenu)-1;

        if (choice == 6) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu();
        }
        else if (choice == 7) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedIceCream = Desserts.getIceCreamsList().get(choice);
            double price = Desserts.getIceCreamsList().get(choice).getPrice();
            String nameWithPrice = selectedIceCream.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.iceCreamCustomization();


        }
    }

    public static void addMcFlurryToCart() {

        int sizeOfIceMcFlurry = Desserts.getMcFlurryList().size()+2;
        //adding 2 to listSize - finalization option and back option.
        int choice = getValidNumber.getValidNumberAddToCart(MyScanner.getNewInstance(), "McFlurry", sizeOfIceMcFlurry)-1;

        if (choice == 12) {
            Desserts.displayPreDessertMenu();
            displayDessertsMainMenu(); }
        else if (choice == 13) { Finalization.finalizationOfOrder(); }

        else {
            Desserts selectedMcFlurry = Desserts.getMcFlurryList().get(choice);
            double price = Desserts.getMcFlurryList().get(choice).getPrice();
            String nameWithPrice = selectedMcFlurry.toString();
            CartList.addElementToCart(nameWithPrice, 1);
            System.out.printf("\n%.2f PLN added to bill.\n", price);
            DessertsCustomization.mcFlurryCustomization();


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
