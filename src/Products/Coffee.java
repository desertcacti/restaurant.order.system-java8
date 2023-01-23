package Products;
import java.util.ArrayList;
import java.util.Scanner;

public class Coffee {

    private String name;

    private double price;

    private static final ArrayList<Coffee> coffees = new ArrayList<>();

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public static void createCoffeeList() {


        coffees.add(new Coffee("Kawa Czarna", 8.90));
        coffees.add(new Coffee("Kawa z Mlekiem", 9.70));
        coffees.add(new Coffee("Flat White", 12.40));
        coffees.add(new Coffee ("Caffe Latte", 12.40));
        coffees.add(new Coffee("Iced Latte", 14.40));
        coffees.add(new Coffee("Iced Carmel Latte", 15.30));
        coffees.add(new Coffee("Kawa Czarna", 8.90));
        coffees.add(new Coffee("Carmel Latte Macchiato", 16.60));

    }

    public static void displayCoffee() {

        int i = 1;

        for (Object c : coffees) {


            System.out.println(i + "." + c);

            i++;

        }
        System.out.println("\n9.Back");
        System.out.println("10.Finalize");
    }


    public static void addCoffeeToBill() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect coffee you want to add to your order: ");
        int choice = sc.nextInt() - 1;

        if (choice == 8) {
            displayView.Start();
        } else if (choice == 9) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 9) {
            System.out.println("Wrong number selected.");
            addCoffeeToBill();
        } else {

            double priceOfChosenCoffee = Coffee.coffees.get(choice).getPrice();
            Coffee c = Coffee.coffees.get(choice);

            FinalizationOrder.test.addToTheList(c);


            System.out.printf("%.2f", priceOfChosenCoffee);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenCoffee;


            Coffee.addCoffeeToBill();
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