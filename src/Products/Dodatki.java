package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Dodatki {
    private String name;
    private double price;

    private static final ArrayList<Dodatki> dodatki = new ArrayList<>();


    public Dodatki(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void createDodatkiList() {

        dodatki.add(new Dodatki("Oliwa z oliwek", 1.50));
        dodatki.add(new Dodatki("Ketchup", 1.50));
        dodatki.add(new Dodatki("Sos koperkowy", 2.00));
        dodatki.add(new Dodatki("Sos 1000 wysp", 2.00));
        dodatki.add(new Dodatki("Sos Vinegret", 2.00));
        dodatki.add(new Dodatki("Sos słodko-kwaśny", 2.00));
        dodatki.add(new Dodatki("Sos Barbeque", 2.00));
        dodatki.add(new Dodatki("Sos Musztardowy", 2.00));
        dodatki.add(new Dodatki("Sos śmietanowy", 2.00));
        dodatki.add(new Dodatki("Sos czosnkowy", 2.00));
    }
    public static void displayDodatkiList() {

        int i = 1;

        for (Object d : dodatki) {


            System.out.println(i + "." + d);

            i++;
        }

        System.out.println("\n11.Back");
        System.out.println("12.Finalize");
    }


    public static void addDodatkiToBill() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect dodatek you want to add to your order: ");
        int choice = sc.nextInt() - 1;

        if (choice == 10) {
            displayView.Start();
        } else if (choice == 11) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 11) {
            System.out.println("Wrong number selected.");
            addDodatkiToBill();
        } else {


            double priceOfChoseenDodatek = Dodatki.dodatki.get(choice).getPrice();
            Dodatki d = Dodatki.dodatki.get(choice);

            FinalizationOrder.test.addToTheList(d);

            System.out.printf("%.2f", priceOfChoseenDodatek);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChoseenDodatek;

            Dodatki.addDodatkiToBill();
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