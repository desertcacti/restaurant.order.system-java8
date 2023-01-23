package Operation_System_View;

import java.util.Scanner;

public interface displayView {


    static void Start() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome in McDonald\n");
        displayMenu();


        int choice = sc.nextInt();
        switch (choice) {


            case 1:

                Burger.displayHamburgers();
                Burger.addBurgerToBill();
                break;



            case 2:

                Wraps.displayWrapsList();
                Wraps.addWrapToBill();
                break;


            case 3:

                Frytki.displayFrytkiList();
                Frytki.addFriesToBill();
                break;


            case 4:
                Nuggets.displayNuggetsList();
                Nuggets.addNuggetsToBill();
                break;


            case 5:
                Drinks.displayDrinksList();
                Drinks.addDrinksToBill();
                break;


            case 6:
                Coffee.displayCoffee();
                Coffee.addCoffeeToBill();
                break;


            case 7:
                Desery.displayDeseryList();
                Desery.addDeseryToBill();
                break;

            case 8:
                Dodatki.displayDodatkiList();
                Dodatki.addDodatkiToBill();
                break;


            case 9:
                System.out.println("Goodbay!\nThank you for visiting us!");

        }


    }


    public static void displayMenu() {
        System.out.println("1.Burgery\n2.Wrap\n3.Frytki\n4.Nuggetsy\n5.Drinks\n6.Coffee\n7.Desery\n8.Dodatki\n9.Exit\n\nEnter choice: ");
    }

}
