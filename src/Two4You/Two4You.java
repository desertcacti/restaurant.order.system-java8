package Two4You;

import FinalizationOrder.CartList;
import Interfaces.Other.MyScanner;

public class Two4You {
    private static final double basicPrice = 7.90;
    private static final double extraValueCostV1 = 1.60;
    private static final double extraValueCostV2 = 3.60;

    public static void two4YouMethod() {

        System.out.println("Our Two4You menu:\n");
        displayFirsTwo4YouMenuView();
        System.out.print("Select your Two4You basic item: ");
        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                //HAMBURGER
                extraValueMealQuestion(basicPrice, extraValueCostV1, "Hamburger");
                break;

            case 2:
                //CHEESEBURGER
                extraValueMealQuestion(basicPrice, extraValueCostV1, "Cheeseburger");
                break;

            case 3:
                //CHIKKER
                extraValueMealQuestion(basicPrice, extraValueCostV1, "Chikker");
                break;

            case 4:
                //RED CHIKKER
                extraValueMealQuestion(basicPrice, extraValueCostV1, "Red Chikker");
                break;

            case 5:
                //JALAPENO BURGER
                extraValueMealQuestion(basicPrice, extraValueCostV2, "Jalapeno Burger");
                break;

            case 6:
                //BACK
                break;


        }
    }

    static void extraValueMealQuestion(double basicPrice, double extraValueCost, String name) {

        System.out.printf("\nDo you want make it an extra value meal? + %.2f PLN?", extraValueCost);
        System.out.println("\n\n1.Yes\n2.No\n");
        System.out.print("Enter number: ");

        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                double cost = basicPrice + extraValueCost;
                CartList.addToCartValue(cost);
                displaySecondItemExtraValueMenu();
                secondItemChoice(name, cost);
                // add cusotmizationTwo4You Class

                break;


            case 2:
                CartList.addToCartValue(basicPrice);
                displaySecondItemBasicMenu();
                secondItemChoice(name, basicPrice);
                // add cusotmizationTwo4You Class

                break;
        }

    }

    static void secondItemChoice(String name, double cost) {

        int choice = MyScanner.myIntScanner();

        switch (choice) {

            case 1:
                System.out.println("Your Two4You consists of:\n");
                System.out.println(name + " + small fries - " + cost + " PLN");

                break;


            case 2:
                System.out.println("Your Two4You consists of:\n");
                System.out.printf(name + " + CocaCola - %.2f PLN", cost);


                break;


            case 3:

                System.out.println("Your Two4You consists of:\n");
                System.out.printf(name + " + CocaCola Zero - %.2f + PLN", cost);

                break;

            case 4:
                System.out.println("Your Two4You consists of:\n");
                System.out.printf(name + " + Fanta - %.2f + PLN", cost);

                break;

            case 5:
                System.out.println("Your Two4You consists of:\n");
                System.out.printf(name + " + Sprite - %.2f + PLN", cost);

                break;

            case 6:

                System.out.println("Your Two4You consists of:\n");
                System.out.printf(name + " + IceTea - %.2f PLN", cost);


                break;

        }
    }


    static void displaySecondItemBasicMenu() {

        System.out.println("\nSecond item menu:\n\n1.Small fries\n2.Coca-Cola 250ml\n3.Coca-Cola Zero 250ml\n4.Fanta 250ml\n" +
                "5.Sprite 250ml\n6.Ice Tea 250ml\n\nSelect second item: \n");


    }
    static void displaySecondItemExtraValueMenu() {

        System.out.print("\nSecond item menu:\n\n1.Medium fries\n2.Coca-Cola 400ml\n3.Coca-Cola Zero 400ml\n4.Fanta 400ml\n" +
                "5.Sprite 400ml\n6.Ice Tea 400ml\n\nSelect second item: \n");
    }


        static void displayFirsTwo4YouMenuView() {

            System.out.println("1.Hamburger\n2.Cheeseburger\n3.Chikker\n4.Red Chikker\n5.Jalapeno Burger\n\n6.Back\n");
        }


    }






