package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Desery {

    private String name;

    private double price;

    private static final ArrayList<Desery> desery = new ArrayList<>();

    public Desery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public static void createDeseryList() {

        desery.add(new Desery("Ciastko mango-marakuja", 7.90));
        desery.add(new Desery("Ciastko jabłkowe", 7.90));
        desery.add(new Desery("Muffin z truskawkami i białą czekoladą", 7.70));
        desery.add(new Desery("Muffin z czekoladą", 7.70));
        desery.add(new Desery("Zawijas z nugatem", 7.70));
        desery.add(new Desery("Croassant maślany", 6.60));
        desery.add(new Desery("Croassant kakaowy", 7.70));
        desery.add(new Desery("Ciastko słony karmel", 6.60));
        desery.add(new Desery("Ciastko owsiane", 6.60));
        desery.add(new Desery("Ciastko z kawałkami czekolady", 6.60));
        desery.add(new Desery("Lody śmietankowe z polewą czekoldową", 9.90));
        desery.add(new Desery("Lody śmietankowe z polewą truskawkową", 9.90));
        desery.add(new Desery("Lody śmietankowe z polewą karmelową", 9.90));
        desery.add(new Desery("Lody czekoladowe z polewą czekoldową", 9.90));
        desery.add(new Desery("Lody czekoladowe z polewą truskawkową", 9.90));
        desery.add(new Desery("Lody czekoladowe z polewą karmelową", 9.90));
        desery.add(new Desery("McFlurry śmietankowe z posypką Lion", 11.50));

    }

    public static void displayDeseryList() {

        int i = 1;

        for (Object d : desery) {

            System.out.println(i + "." + d);

            i++;

        }
        System.out.println("\n18.Back");
        System.out.println("19.Finalize");
    }

    public static void addDeseryToBill() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect deser you want to add to your order: ");
        int choice = sc.nextInt() - 1;

        if (choice == 17) {
            displayView.Start();
        } else if (choice == 18) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 18) {
            System.out.println("Wrong number selected.");
            addDeseryToBill();
        } else {

            double priceOfChosenDesery = Desery.desery.get(choice).getPrice();
            Desery d = Desery.desery.get(choice);

            FinalizationOrder.test.addToTheList(d);

            System.out.printf("%.2f", priceOfChosenDesery);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenDesery;

            Desery.addDeseryToBill();
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
