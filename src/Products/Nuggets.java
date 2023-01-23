package Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Nuggets {

    private String name;

    private double price;

    private static final ArrayList<Nuggets> nuggets = new ArrayList<>();



    public Nuggets(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }





    public static void createNuggetsList() {


        nuggets.add(new Nuggets("Six McNuggets", 16.00));
        nuggets.add(new Nuggets("Nine McNuggets", 18.80));
        nuggets.add(new Nuggets("Twenty McNuggets", 30.30));
        nuggets.add(new Nuggets("Three Chicken Tenders", 16.70));
        nuggets.add(new Nuggets("Five Chicken Tenders", 21.30));
        nuggets.add(new Nuggets("ChickenBox", 43.40));

    }



    public static void displayNuggetsList() {

        int i = 1;

        for (Object n : nuggets) {


            System.out.println(i + "." + n);

            i++;
        }
        System.out.println("\n7.Back");
        System.out.println("8.Finalize");
    }


    public static void addNuggetsToBill() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect nuggets you want to add to your order: ");
        int choice = sc.nextInt()-1;

        if (choice == 6) {
            displayView.Start();
        } else if (choice == 7) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 7) {
            System.out.println("Wrong number selected.");
            addNuggetsToBill();

        } else {

            double priceOfChosenNuggets = Nuggets.nuggets.get(choice).getPrice();
            Nuggets n = Nuggets.nuggets.get(choice);


            FinalizationOrder.test.addToTheList(n);


            System.out.printf("%.2f", priceOfChosenNuggets);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenNuggets;


            Nuggets.addNuggetsToBill();


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


