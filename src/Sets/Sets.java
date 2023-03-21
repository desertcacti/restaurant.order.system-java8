package Sets;

import Finalization.CartList;
import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getValidNumber;
import OperatingSystem.SystemStart;
import Products.Burger;
import Products.Drinks;
import Products.Nuggets;
import Products.Wraps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sets {

    private String name;
    private double price;

    private static double priceOfPreSet;
    private static final ArrayList<Burger> burgersListAvailableInSets = new ArrayList<>(Arrays.asList(
            new Burger("McChicken", 16.70),
            new Burger("Veggie Burger", 18.60),
            new Burger("Wieśniak", 19.10),
            new Burger( "McRoyal", 19.10),
            new Burger( "Big Mac", 19.40),
            new Burger("Supreme Chicken Sweet & Spicy Burger", 22.70)));
    private static final ArrayList<Drinks> drinksListAvailableInBasicSet = new ArrayList<>(Arrays.asList(
            new Drinks("Still water", 8.70),
            new Drinks("Sparkling water", 8.70),
            new Drinks("Tea", 9.10),
            new Drinks("Lipton Ice Tea", 7.50),
            new Drinks("CocaCola", 7.50),
            new Drinks("CocaCola Zero", 7.50),
            new Drinks("Fanta", 7.50),
            new Drinks("Sprite", 7.50)
    ));

    private static final ArrayList<Drinks> drinksAvailableInExtraValueSet = new ArrayList<>(Drinks.getDrinksList());

    public Sets(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void setsStart() {

        String firstItemName;
        String secondItemName;
        String drinkName;
        boolean isExtraValue;

        System.out.println("\nSet main menu:\n");
        displaySetsMenu();

            int choice = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(),5);

            switch (choice) {

                case 1:
                    //BURGERS CHOICE
                    printBurgersInSetsList();
                    firstItemName = chooseBurgerToYourSet(MyScanner.getNewInstance());
                    isExtraValue = extraValueMealQuestion();
                    secondItemName = chooseSecondElementToYourSet(isExtraValue, MyScanner.getNewInstance());
                    drinkName = chooseDrinkToYourSet(isExtraValue, MyScanner.getNewInstance());
                    setsFinalization(firstItemName, secondItemName, drinkName, MyScanner.getNewInstance(), isExtraValue);
                    break;

                case 2:
                    //WRAPS CHOICE
                    displayWrapsMenuAvailableInSets();
                    firstItemName = chooseWrapToYourSet(MyScanner.getNewInstance());
                    isExtraValue = extraValueMealQuestion();
                    secondItemName = chooseSecondElementToYourSet(isExtraValue, MyScanner.getNewInstance());
                    drinkName = chooseDrinkToYourSet(isExtraValue, MyScanner.getNewInstance());
                    setsFinalization(firstItemName, secondItemName, drinkName, MyScanner.getNewInstance(), isExtraValue);
                    break;

                case 3:
                    //NUGGETS CHOICE
                    displayNuggetsMenuAvailableInSets();
                    firstItemName = chooseNuggetsToYourSet(MyScanner.getNewInstance());
                    isExtraValue = extraValueMealQuestion();
                    secondItemName = chooseSecondElementToYourSet(isExtraValue, MyScanner.getNewInstance());
                    drinkName = chooseDrinkToYourSet(isExtraValue, MyScanner.getNewInstance());
                    setsFinalization(firstItemName, secondItemName, drinkName, MyScanner.getNewInstance(), isExtraValue);
                    break;

                case 4:
                    SystemStart.Start();
                    break;

                case 5:
                    Finalization.finalizationOfOrder();
                    break;

            }
        }


    private static String chooseBurgerToYourSet(Scanner sc) {

            String name = "";
            int burgerListSize = burgersListAvailableInSets.size();
            int choice = getValidNumber.getValidNumberInSets(MyScanner.getNewInstance(), burgerListSize, "burger")-1;
            System.out.println();

            switch (choice) {
                default:
                    name = burgersListAvailableInSets.get(choice).getName();
                    priceOfPreSet += burgersListAvailableInSets.get(choice).getPrice();
                    break;
        }
        return name;
    }

    private static String chooseWrapToYourSet(Scanner sc) {

        String name;
        int choice = getValidNumber.getValidNumberInSets(MyScanner.getNewInstance(), Wraps.getWrapsList().size(), "wrap")-1;
        System.out.println();
        switch (choice) {
            default:
                name = Wraps.getWrapsList().get(choice).getName();
                priceOfPreSet += Wraps.getWrapsList().get(choice).getPrice();
                break;
        }
        return name;
    }

    private static String chooseNuggetsToYourSet(Scanner sc) {

        String name;
        int choice = getValidNumber.getValidNumberInSets(MyScanner.getNewInstance(), Nuggets.getNuggetsList().size(), "nuggets")-1;
        System.out.println();

        switch (choice) {
            default:
                name = Nuggets.getNuggetsList().get(choice).getName();
                priceOfPreSet += Nuggets.getNuggetsList().get(choice).getPrice();
                break;
        }
        return name;
    }


    private static boolean extraValueMealQuestion() {

        boolean isExtraValue = false;
        System.out.println("Do you want make it an extra value meal? Y/N");
        String choice = MyScanner.myLineScanner();

        switch (choice) {

            case "Y":
                isExtraValue = true;
                break;

            case "N":
                isExtraValue = false;
                break;

            default:
                System.out.println("\nInvalid input. Please try again...");
                extraValueMealQuestion();
                break;
        }
        return isExtraValue;
    }

    private static String chooseSecondElementToYourSet(boolean isExtraValue, Scanner sc) {

        boolean validInput = false;
        String secondItemName = "";
        printSecondItemMenu(isExtraValue);



            if (isExtraValue == false) {
                //BASIC OPTION
                int choice = getValidNumber.getValidNumberInSetsSecondItem(MyScanner.getNewInstance(), 2);

                switch (choice) {
                    case 1:
                        secondItemName = "Fries";
                        priceOfPreSet += 10.50;
                        break;
                    case 2:
                        secondItemName = "Salad";
                        priceOfPreSet += 7.50;
                        break;
                }

            } else {
                //EXTRA VALUE
                int choice = getValidNumber.getValidNumberInSetsSecondItem(MyScanner.getNewInstance(), 3);

                switch (choice) {
                    case 1:
                        secondItemName = "Fries";
                        priceOfPreSet += 10.50;
                        break;
                    case 2:
                        secondItemName = "Salad";
                        priceOfPreSet += 7.50;
                        break;

                    case 3:
                        secondItemName = "Baked potatoes";
                        priceOfPreSet += 9.50;
                        break;
                }
            }
        return secondItemName;
    }


    private static String chooseDrinkToYourSet(boolean isExtraValue, Scanner sc) {

        String drinkName = "";
        printDrinksMenu(isExtraValue);
        ArrayList<Drinks> chosenDrinksList = chooseProperDrinkList(isExtraValue);

        System.out.println();
        int choice = getValidNumber.getValidNumberInSetsDrinkItem(MyScanner.getNewInstance(), chosenDrinksList.size())-1;

        switch(choice) {
            default:
                drinkName = chosenDrinksList.get(choice).getName();
                priceOfPreSet += chosenDrinksList.get(choice).getPrice();
        }
        return drinkName;
    }


    private static void setsFinalization(String firstItemName, String secondItemName, String drinkName, Scanner sc, boolean isExtraValue) {

        String fullSetName =  firstItemName + " + " + secondItemName + " + " + drinkName;

        if(isExtraValue == false) {
            priceOfPreSet = priceOfPreSet * 0.7;
        } else {
            priceOfPreSet = (priceOfPreSet * 0.7) + 3.60;
            // adding fixed price for ExtraValueMeal
        }

        Sets newSet = new Sets(fullSetName, priceOfPreSet);
        System.out.println("\nYour set includes: \n" + newSet + "\n\nDo you want to change your set components? Y/N");
        String choice = sc.nextLine();

        switch (choice) {

            case "Y":
                priceOfPreSet = 0.00;
                setsStart();
                break;

            case "N":
                CartList.addElementToCart(fullSetName, 1);
                System.out.printf("\n%.2f PLN added to bill.\n", priceOfPreSet);
                priceOfPreSet = 00.00;
                setsStart();
                break;
        }
    }


//    private static void addToCartList(Sets set, double price) {
//        CartList.addToCartList(set);
//        CartList.addToCartValue(price);
//    }

    //DISPLAYS METHODS:


    private static void displaySetsMenu() {

        System.out.println("1.Burgers\n2.Wraps\n3.Nuggets\n\n4.Back\n5.Finalize order\n");
    }

    private static void printBurgersInSetsList() {
        int enumeration = 1;
        System.out.println("\nBurgers menu: \n");
        for (Burger b : burgersListAvailableInSets) {
            System.out.println(enumeration + "." + b.getName());
            enumeration++;
        }
        System.out.print("\n");
    }

    private static void printSecondItemMenu(boolean isExtraValue) {

        System.out.println("Second item menu:\n");
        if (isExtraValue == false) {
            System.out.println("1.Fries\n2.Salad\n");
        } else {
            System.out.println("1.Fries\n2.Salad\n3.Baked potatoes\n");
        }
    }

    private static void printDrinksMenu(boolean isExtraValue) {
        int enumeration = 1;
        System.out.println("\nDrinks menu: \n");
        if (isExtraValue == false) {
            for (Drinks d : drinksListAvailableInBasicSet) {
                System.out.println(enumeration + "." + d.getName());
                enumeration++;
            }
        } else {
                for (Drinks d : drinksAvailableInExtraValueSet) {
                    System.out.println(enumeration + "." + d.getName());
                    enumeration++;
                }
        }
    }

    private static ArrayList chooseProperDrinkList(boolean isExtraValue) {
        if(isExtraValue == false) {
            return drinksListAvailableInBasicSet;
        } else {
            return drinksAvailableInExtraValueSet;
        }

    }

    private static void displayWrapsMenuAvailableInSets() {
        System.out.println("\nWraps menu:\n\n1.McWrap Veggie\n2.McWrap Crispy Classic\n3.McWrap Crispy Bacon Deluxe" +
        "\n4.McWrap Supreme Chicken Sweet & Spicy\n");
    }

    private static void displayNuggetsMenuAvailableInSets() {
        System.out.println("\nNuggets menu:\n\n1.Six McNuggets\n" +
                "2.Nine McNuggets\n" +
                "3.Twenty McNuggets\n" +
                "4.Three Chicken Tenders\n" +
                "5.Five Chicken Tenders\n" +
                "6.ChickenBox\n");
    }

    @Override
    public String toString() {
        return "Set - " + name + " - "  +  String.format("%.2f", price)
                + " PLN";

    }
}
