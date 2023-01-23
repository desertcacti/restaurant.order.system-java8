package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Wraps {

    private String name;
    private double price;

    private static final ArrayList<Wraps> wraps = new ArrayList<>();

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



    public static void createWrapsList() {


        wraps.add(new Wraps("McWrap Veggie", 18.60));
        wraps.add(new Wraps("McWrap Chrupiący Klasyczny", 19.90));
        wraps.add(new Wraps("McWrap Chrupiący Bekon Deluxe", 20.50));
        wraps.add(new Wraps("McWrap Supreme Chicken Sweet & Spicy", 22.70));
        wraps.add(new Wraps("McWrap Veggie", 18.60));
    }

    public static void displayWrapsList() {

        int i = 1;

        for (Object w : wraps) {
            System.out.println(i + "." + w);

            i++;
        }
        System.out.println("\n6.Back");
        System.out.println("7.Finalize order");
    }


    public static void addWrapToBill() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect wrap you want to add to your order: ");
        int choice = sc.nextInt()-1;

        if (choice == 5) {
            displayView.Start();
        } else if (choice == 6) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 6) {
            System.out.println("Wrong number selected.");
            addWrapToBill();
        } else {

            double priceOfChosenWrap = Wraps.wraps.get(choice).getPrice();
            Wraps w = Wraps.wraps.get(choice);

            FinalizationOrder.test.addToTheList(w);


            System.out.printf("%.2f", priceOfChosenWrap);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenWrap;

            Wraps.addWrapToBill();

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





