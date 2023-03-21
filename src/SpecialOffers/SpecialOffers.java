package SpecialOffers;

import Finalization.Finalization;
import Interfaces.MyScanner;
import Interfaces.getRandomElement;
import OperatingSystem.SystemStart;
import Products.*;
import Interfaces.getValidNumber;
import Finalization.CartList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class SpecialOffers {
    private String name;
    private double price;
    static int counterOpened = 0;

    public SpecialOffers(String name, double price) {
        this.name = name;
        this.price = price;
    }
    private static final ArrayList<SpecialOffers> mainItemsList = new ArrayList<>(Arrays.asList(
            new SpecialOffers("Jalapeno Burger", 6.50),
            new SpecialOffers("Hamburger", 5.90),
            new SpecialOffers("Chikker", 7.50),
            new SpecialOffers("Cheeseburger", 6.50),
            new SpecialOffers("McDouble", 9.90),
            new SpecialOffers("McChicken", 16.70),
            new SpecialOffers("Veggie Burger", 18.60),
            new SpecialOffers("Wieśniak", 19.10),
            new SpecialOffers( "McRoyal", 19.10),
            new SpecialOffers( "Big Mac", 19.40),
            new SpecialOffers("Supreme Chicken Sweet & Spicy Burger", 22.70),
            new SpecialOffers("Six McNuggets", 16.00),
            new SpecialOffers("Nine McNuggets", 18.80),
            new SpecialOffers("Twenty McNuggets", 30.30),
            new SpecialOffers("Three Chicken Tenders", 16.70),
            new SpecialOffers("Five Chicken Tenders", 21.30),
            new SpecialOffers("ChickenBox", 43.40),
            new SpecialOffers("McWrap Veggie", 18.60),
            new SpecialOffers("McWrap Crispy Classic", 19.90),
            new SpecialOffers("McWrap Crispy Bacon Deluxe", 20.50),
            new SpecialOffers("McWrap Supreme Chicken Sweet & Spicy", 22.70)));


    private final static ArrayList<SpecialOffers> specialOffersList = new ArrayList<>();



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public static void specialOffersStart() {


        if (counterOpened == 0) {

            Random random = new Random();

            for (int i = 0; i <= 7; i++) {

                int randomNumber = random.nextInt(12); // generates a random number between 0 and 11

                switch (randomNumber) {

                    case 0:
                        SpecialOffers obj1 = firstVariant();
                        specialOffersList.add(obj1);
                        break;

                    case 1:
                        SpecialOffers obj2 = secondVariant();
                        specialOffersList.add(obj2);
                        break;

                    case 2:
                        SpecialOffers obj3 = thirdVariant();
                        specialOffersList.add(obj3);
                        break;

                    case 3:
                        SpecialOffers obj4 = fourthVariant();
                        specialOffersList.add(obj4);
                        break;

                    case 4:
                        SpecialOffers obj5 = fifthVariant();
                        specialOffersList.add(obj5);
                        break;

                    case 5:
                        SpecialOffers obj6 = sixthVariant();
                        specialOffersList.add(obj6);
                        break;

                    case 6:
                        SpecialOffers obj7 = seventhVariant();
                        specialOffersList.add(obj7);
                        break;

                    case 7:
                        SpecialOffers obj8 = eighthVariant();
                        specialOffersList.add(obj8);
                        break;

                    case 8:
                        SpecialOffers obj9 = ninthVariant();
                        specialOffersList.add(obj9);
                        break;

                    case 9:
                        SpecialOffers obj10 = tenthVariant();
                        specialOffersList.add(obj10);
                        break;

                    case 10:
                        SpecialOffers obj11 = eleventhVariant();
                        specialOffersList.add(obj11);
                        break;

                    case 11:
                        SpecialOffers obj12 = twelfthVariant();
                        specialOffersList.add(obj12);
                        break;
                }
            }
            counterOpened++;
            displaySpecialOffersList();
            finalizationOfSpecialOffers();
        } else {
            displaySpecialOffersList();
           finalizationOfSpecialOffers();
        }
    }


    private static void finalizationOfSpecialOffers() {



        int choice = getValidNumber.getValidNumberMain(MyScanner.getNewInstance(), 10)-1;

        switch(choice) {

            case 0,1,2,3,4,5,6,7:
                SpecialOffers specialOffersChosen = getSpecialOffersList().get(choice);
                double selectedItemPrice = specialOffersChosen.getPrice();
                String nameWithPrice = specialOffersChosen.toString();
                CartList.addElementToCart(nameWithPrice, 1);
                System.out.printf("\n%.2f PLN added to bill.\n", selectedItemPrice);
                finalizationOfSpecialOffers();
                break;

            case 8:
                SystemStart.Start();
                break;

            case 9:
                Finalization.finalizationOfOrder();
                break;

        }
    }


    private static SpecialOffers firstVariant() {
        //MAIN + DRINK + FRIES
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);
        Drinks randomDrink = getRandomElement.getRandomElement(Drinks.getDrinksList());
        Fries randomFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = firstObject.getName() + " + " + randomDrink.getName() + " + " + randomFries.getName();
        double fullPrice = ((firstObject.getPrice() + randomDrink.getPrice() + randomFries.getPrice()) * 0.5);

        return new SpecialOffers(fullName,fullPrice);
    }


    private static SpecialOffers secondVariant() {
        //MAIN + DRINK
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);
        Drinks randomDrink = getRandomElement.getRandomElement(Drinks.getDrinksList());

        String fullName = firstObject.getName() + " + " + randomDrink.getName();
        double fullPrice = ((firstObject.getPrice() + randomDrink.getPrice()) * 0.5);

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers thirdVariant() {
        //MAIN
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);

        String fullName = firstObject.getName();
        double fullPrice = ((firstObject.getPrice()) * 0.5);

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers fourthVariant() {
        //MAIN x 2
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);

        String fullName = "2 x " + firstObject.getName();
        double fullPrice = (firstObject.getPrice());

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers fifthVariant() {
        //FRIES x 2
        Fries randomFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = "2 x " + randomFries.getName();
        double fullPrice = (randomFries.getPrice());

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers sixthVariant() {
        //COFFEES x 2
        Coffees randomCoffee = getRandomElement.getRandomElement(Coffees.getCoffeesList());

        String fullName = "2 x " + randomCoffee.getName();
        double fullPrice = (randomCoffee.getPrice());

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers seventhVariant() {
        //ICE CREAMS x 2
        Desserts randomIceCream = getRandomElement.getRandomElement(Desserts.getIceCreamsList());

        String fullName = "2 x " + randomIceCream.getName();
        double fullPrice = (randomIceCream.getPrice());

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers eighthVariant() {
        //DESSERT + COFFEE
        Desserts randomDessert = getRandomElement.getRandomElement(Desserts.getDessertsList());
        Coffees randomCoffee = getRandomElement.getRandomElement(Coffees.getCoffeesList());

        String fullName = randomDessert.getName() + " + " + randomCoffee.getName();
        double fullPrice = ((randomDessert.getPrice() + randomCoffee.getPrice()) * 0.5);

        return new SpecialOffers(fullName,fullPrice);

    }

    private static SpecialOffers ninthVariant() {
        //MAIN x 2 + FRIES x 2
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);
        Fries firstFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = "2 x " + firstObject.getName() + " 2 x " + firstFries.getName();
        double fullPrice = ((firstObject.getPrice() + firstFries.getPrice()));

        return new SpecialOffers(fullName,fullPrice);
    }

    private static SpecialOffers tenthVariant() {
        //THE SAME MAIN x 2 + FRIES x 1
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);
        Fries firstFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = "2 x " + firstObject.getName() + " + " + firstFries.getName();
        double fullPrice = ((firstObject.getPrice() + (firstFries.getPrice() * 0.5)));

        return new SpecialOffers(fullName,fullPrice);

    }

    private static SpecialOffers eleventhVariant() {
        //DIFFERENT MAIN x 2 + FRIES x 1
        SpecialOffers firstObject = getRandomElement.getRandomElement(mainItemsList);
        SpecialOffers secondObject = getRandomElement.getRandomElement(mainItemsList);
        Fries firstFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = firstObject.getName() + " + " + secondObject.getName() + " + " + firstFries.getName();
        double fullPrice = ((firstObject.getPrice() + secondObject.getPrice() + firstFries.getPrice()) * 0.5);

        return new SpecialOffers(fullName,fullPrice);

    }

    private static SpecialOffers twelfthVariant() {
        //BIG FRIES / HALF-PRICE
        Fries firstFries = getRandomElement.getRandomElement(Fries.getFriesList());

        String fullName = firstFries.getName();
        double fullPrice = (firstFries.getPrice() * 0.5);

        return new SpecialOffers(fullName,fullPrice);
    }

    public static void displaySpecialOffersList() {

        int enumeration = 1;

        System.out.println("\nSpecial offers menu:\n");

        for(SpecialOffers s : specialOffersList) {
            System.out.println(enumeration + ". " + s.getName() + " - " + String.format("%.2f", s.getPrice()) + " PLN");

            enumeration++;
        }

        System.out.println("\n9.Back\n10.Finalize order\n");

    }

    public static ArrayList<SpecialOffers> getSpecialOffersList() {
        return specialOffersList;
    }

    @Override
    public String toString() {
        return "Spec.Offer - " + name + " - " + String.format("%.2f PLN", price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != getClass()) return false;
        SpecialOffers other = (SpecialOffers) obj;
        return name.equals(other.name) && price == other.price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }



}