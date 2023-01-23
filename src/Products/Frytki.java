package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Frytki {

    private String name;

    private double price;

    private static final ArrayList<Frytki> frytki = new ArrayList<>();

    public Frytki(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void createFrytkiList() {
        frytki.add(new Frytki("Małe frytki", 9.40));
        frytki.add(new Frytki("Średnie Frytki", 10.50));
        frytki.add(new Frytki("Duże frytki", 10.90));
        frytki.add(new Frytki("Kartofelki", 9.90));

    }

    public static void displayFrytkiList() {

        int i = 1;

        for (Object f : frytki) {
            System.out.println(i + "." + f);

            i++;
        }
        System.out.println("\n5.Back");
        System.out.println("6.Finalize");
    }


    public static void addFriesToBill() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect fries you want to add to your order: ");
        int choice = sc.nextInt()-1;

        if (choice == 4) {
            displayView.Start();
        } else if (choice == 5) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 5) {
            System.out.println("Wrong number selected.");
            addFriesToBill();
        } else {

            double priceOfChosenFries = Frytki.frytki.get(choice).getPrice();
            Frytki f = Frytki.frytki.get(choice);

            FinalizationOrder.test.addToTheList(f);

            System.out.printf("%.2f", priceOfChosenFries);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenFries;

            Frytki.addFriesToBill();


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
