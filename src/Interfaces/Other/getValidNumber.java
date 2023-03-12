package Interfaces.Other;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface getValidNumber {


    static int getValidNumberAddToCart(Scanner scanner, String itemName, int maxRange) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {

            System.out.print("Select " + itemName + " you want to add to your order: ");
            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.print("\nInvalid input. Please try again...\n");
            } else {

                try {
                    input = Integer.parseInt(userInput);

                    if (input > 0 && input <= maxRange) {

                        validInput = true;
                    } else {
                        System.out.print("\nInvalid input. Please try again...\n");
                    }

                } catch (NumberFormatException e) {
                    System.out.print("\nInvalid input. Please try again...\n");
                }
            }
        }
        return input;
    }

    static int getValidNumberCustomization(Scanner scanner, int maxRange, String name) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {

            System.out.print("Select addition you want to add to your " + name + ": ");
            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.print("\nInvalid input. Please try again...\n");
            } else {

                try {
                    input = Integer.parseInt(userInput);

                    if (input > 0 && input <= maxRange) {

                        validInput = true;
                    } else {
                        System.out.print("\nInvalid input. Please try again...\n");
                    }

                } catch (NumberFormatException e) {
                    System.out.print("\nInvalid input. Please try again...\n");
                }
            }
        }


        return input;
    }

    static int getValidNumber(Scanner scanner, int maxRange) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.print("\nInvalid input. Please try again...\n");


            } else {

                try {
                    input = Integer.parseInt(userInput);

                    if(input > 0 && input <= maxRange) {

                        validInput = true;
                    } else {
                        System.out.print("\nInvalid input. Please try again...\n");
                    }

                } catch (NumberFormatException e) {
                    System.out.print("\nInvalid input.Please try again...\n");
                }
            }
        }

        return input;

    }

    static int getValidNumberTwo4You(Scanner scanner, int maxRange) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.print("\nInvalid input. Please try again...");


            } else {

                try {
                    input = Integer.parseInt(userInput);

                    if(input > 0 && input <= maxRange) {

                        validInput = true;
                    } else {
                        System.out.print("\nInvalid input. Please try again...");
                    }

                } catch (NumberFormatException e) {
                    System.out.print("\nInvalid input.Please try again...");
                }
            }
        }

        return input;

    }

    }

