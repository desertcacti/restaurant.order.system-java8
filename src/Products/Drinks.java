package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinks {

    private String name;

    private double price;

    static double totalDrinksPriceInOrder = 00.00;

    private static final ArrayList<Drinks> drinks = new ArrayList<>();

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





    public static void createDrinksList() {

        drinks.add(new Drinks("Shake Czekoladowy", 8.90));
        drinks.add(new Drinks("Shake Waniliowy", 7.50));
        drinks.add(new Drinks("Shake Truskawkowy", 7.50));
        drinks.add(new Drinks("Sprite", 7.50));
        drinks.add(new Drinks("Lipton Ice Tea", 7.50));
        drinks.add(new Drinks("CocaCola 0", 7.50));
        drinks.add(new Drinks("Fanta", 7.50));
        drinks.add(new Drinks("Coca Cola", 7.50));
        drinks.add(new Drinks("Woda Gazowana", 8.70));
        drinks.add(new Drinks("Woda Niegazowana", 8.70));
        drinks.add(new Drinks("Herbata", 9.10));




    }



    public static void displayDrinksList() {

        int i = 1;

        for (Object d : drinks) {


            System.out.println(i + "." + d);

            i++;



        }

        System.out.println("\n12.Back");
        System.out.println("13.Finalize");
    }

    public static void addDrinksToBill() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect drinks you want to add to your order: ");
        int choice = sc.nextInt() - 1;

        if (choice == 11) {
            displayView.Start();
        } else if (choice == 12) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 12) {
            System.out.println("Wrong number selected.");
            addDrinksToBill();
        } else {


            double priceOfChosenDrinks = Drinks.drinks.get(choice).getPrice();
            Drinks d = Drinks.drinks.get(choice);


            FinalizationOrder.test.addToTheList(d);


            System.out.printf("%.2f", priceOfChosenDrinks);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenDrinks;


            Drinks.addDrinksToBill();


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