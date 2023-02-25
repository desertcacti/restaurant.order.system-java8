package Two4You;

import FinalizationOrder.CartList;
import Interfaces.Other.MyScanner;
import Operating_System.SystemStart;

import java.io.IOException;

public class Two4You {
    private static final double basicPrice = 7.90;
    private static final double extraValueCostV1 = 1.60;
    private static final double extraValueCostV2 = 3.60;

    private String name;
    private double price;

    public Two4You(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static void displayFirsTwo4YouMenuView() {

        System.out.println("1.Hamburger\n2.Cheeseburger\n3.Chikker\n4.Red Chikker\n5.Jalapeno Burger\n\n6.Back\n");
    }
    static void displayBasicOrExtraValueMenu (boolean isBasicVersion) {

        if(isBasicVersion) {
            System.out.println("\nSecond item menu:\n\n1.Small fries\n2.Coca-Cola 250ml\n3.Coca-Cola Zero 250ml\n4.Fanta 250ml\n" +
                    "5.Sprite 250ml\n6.Ice Tea 250ml\n");
        } else {
            System.out.print("\nSecond item menu:\n\n1.Medium fries\n2.Coca-Cola 400ml\n3.Coca-Cola Zero 400ml\n4.Fanta 400ml\n" +
                    "5.Sprite 400ml\n6.Ice Tea 400ml\n");
        }
    }

    public static void two4YouMethod() {
        //Main Two4You method, also included method which choose first item included.

        System.out.println("\nOur Two4You menu:\n");
        displayFirsTwo4YouMenuView();
        System.out.print("Select your Two4You basic item: ");
        int choice = MyScanner.myIntScanner();
        System.out.print("\n");

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
                SystemStart.Start();
                break;
        }
    }


    static void extraValueMealQuestion(double basicPrice, double extraValueCost, String firstItemName) {
        //Method ask you if you want to add extraValue/Enlarge your Two4You.

        boolean isBasicVersion;

        System.out.printf("Do you want make it an extra value meal? + %.2f PLN? Y/N", extraValueCost);
        System.out.print("\n\nEnter selected: ");

        String choice = MyScanner.myLineScanner();

        switch (choice) {

            case "Y":
                //YES - EXTRA VALUE PRICE
                double finalCost = basicPrice + extraValueCost;
                isBasicVersion = false;
                displayBasicOrExtraValueMenu(isBasicVersion);
                secondItemChoice(firstItemName, finalCost, isBasicVersion);
                break;

            case "N":
                //NO - BASIC PRICE
                isBasicVersion = true;
                displayBasicOrExtraValueMenu(isBasicVersion);
                secondItemChoice(firstItemName, basicPrice, isBasicVersion);
                break;

            default:
                System.out.println("\nPlease try again...");
                extraValueMealQuestion(basicPrice, extraValueCost, firstItemName);
                break;
        }
    }

    static void secondItemChoice(String firstItemName, double cost, boolean isBasicVersion) {
        //SecondItem choice for Basic and ExtraValue Two4You.

        String secondItemName;
        String fullName = null;

        if (isBasicVersion) {
            //FOR BASIC

            System.out.print("Select second item: ");
            int choice = MyScanner.myIntScanner();

            switch (choice) {

                case 1:
                    //FRIES ADDING
                    secondItemName = "Small fries";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 2:
                    //COCA-COLA ADDING
                    secondItemName = "Coca-Cola 250ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;


                case 3:
                    //Coca-Cola Zero ADDING
                    secondItemName = "Coca-Cola Zero 250ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 4:
                    //FANTA ADDING
                    secondItemName = "Fanta 250ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 5:
                    //SPRITE ADDING
                    secondItemName = "Sprite 250ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 6:
                    //ICE TEA ADDING
                    secondItemName = "Ice Tea 250ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                default:
                    System.out.println("\nPlease try again...");
                    secondItemChoice(firstItemName, cost, isBasicVersion);
                    break;
            }

        } else {
            //FOR EXTRA-VALUE
            System.out.print("\nSelect second item: ");
            int choice1 = MyScanner.myIntScanner();

            switch (choice1) {

                case 1:
                    //FRIES ADDING
                    secondItemName = "Medium fries";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;


                case 2:
                    //COCA-COLA ADDING
                    secondItemName = "Coca-Cola 400ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;


                case 3:
                    //Coca-Cola Zero ADDING
                    secondItemName = "Coca-Cola Zero 400ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 4:
                    //FANTA ADDING
                    secondItemName = "Fanta 400ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 5:
                    //SPRITE ADDING
                    secondItemName = "Sprite 400ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    break;

                case 6:
                    //ICE TEA ADDING
                    secondItemName = "Ice Tea 400ml";
                    fullName = firstItemName + " + " + secondItemName;
                    System.out.println("\nYour Two4You includes:");
                    System.out.printf(fullName + " - %.2f PLN", cost);
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("\nPlease try again...");
                    secondItemChoice(firstItemName, cost, isBasicVersion);
                    break;
            }
        }
        System.out.println("\n");
        two4YouFinalization(fullName, cost);
    }

    static void two4YouFinalization(String fullName, double cost) {

        System.out.println("Do you want to change your Two4You components? Y/N");
        System.out.print("\nEnter selected: ");

        String choice = MyScanner.myLineScanner();

        switch (choice) {

            case "Y":
                two4YouMethod();
                break;

            case "N":
                CartList.addToCartValue(cost);
                System.out.printf("\n%.2f PLN added to bill\n", cost);
                Two4You obj = new Two4You(fullName, cost);
                CartList.addToCartList(obj);
                Two4You.two4YouMethod();
                break;

            default:
                System.out.println("\nPlease try again...");
                two4YouFinalization(fullName, cost);
                break;
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