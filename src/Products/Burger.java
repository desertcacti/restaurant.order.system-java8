package Products;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Burger {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    private static final ArrayList<Burger> burgers = new ArrayList<>();

    public static List<Burger> burgers1 = new ArrayList<>(Arrays.asList(new Burger("BigMac", 18.00),
            new Burger("WieśMac", 20.00),
            new Burger("McRoyal",16.00)));




    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public static void createBurgerList() {


        burgers.add(new

                Burger("Jalapeno Burger", 6.50));
        burgers.add(new

                Burger("Hamburger", 5.90));
        burgers.add(new

                Burger("Chikker", 7.50));
        burgers.add(new

                Burger("Cheeseburger", 6.50));
        burgers.add(new

                Burger("McDouble", 9.90));
        burgers.add(new

                Burger("McChicken", 16.70));
        burgers.add(new

                Burger("Veggie Burger", 18.60));
        burgers.add(new

                Burger("Wieśmak", 19.10));
        burgers.add(new

                Burger("McRoyal", 19.10));
        burgers.add(new

                Burger("Big Mac", 19.40));
        burgers.add(new

                Burger("Supreme Chicken Sweet & Spicy Burger", 22.70));
    }

    public static void displayHamburgers() {

        int i = 1;

        for (Object b : burgers) {

            System.out.println(i + "." + b);

            i++;
        }

        System.out.println("\n12.Back");
        System.out.println("13.Finalize order");
    }

    public static void addBurgerToBill() throws InterruptedException {



        System.out.println("\nSelect burger you want to add to your order: ");
        int choice = sc.nextInt() - 1;




        if (choice == 11) {
            displayView.Start();
        } else if (choice == 12) {
            FinalizationOrder.test.printCartList();
        } else if (choice < 0 || choice > 12) {
            System.out.println("Wrong number selected.");
            addBurgerToBill();

        } else {

            double priceOfChosenBurger = Burger.burgers.get(choice).getPrice();
            Burger b = Burger.burgers.get(choice);

            FinalizationOrder.test.addToTheList(b);


            System.out.printf("%.2f", priceOfChosenBurger);
            System.out.print(" PLN added to bill");

            FinalizationOrder.test.finalAmount += priceOfChosenBurger;

            Burger.addBurgerToBill();


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