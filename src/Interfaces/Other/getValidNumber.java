package Interfaces.Other;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface getValidNumber {

//    static int getValidNumberAddToCart(Scanner scanner, String itemName, int maxRange) {
//
//        int number = 0;
//        boolean validInput = false;
//
//        while (!validInput) {
//
//            System.out.print("Select " + itemName + " you want to add to your order: ");
//
//            if (scanner.hasNextInt()) {
//
//                number = scanner.nextInt();
//
//                if (number > 0 && number <= maxRange) {
//
//                    validInput = true;
//
//
//                } else {
//                    scanner.nextLine(); // discard invalid input
//                    System.out.print("\nInvalid input. Please try again...\n");
//                }
//            } else {
//
//                scanner.nextLine(); // discard invalid input
//                System.out.print("\nInvalid input. Please try again...\n");
//            }
//        }
//        return number;
//    }
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

                if(input > 0 && input <= maxRange) {

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
//    static int getValidNumberCustomization(Scanner scanner) {
//
//        int number = 0;
//        boolean validInput = false;
//
//        while (!validInput) {
//
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                validInput = true;
//
//            } else {
//                scanner.nextLine(); // discard invalid input
//                System.out.print("\nInvalid input. Please try again...\nSelect addition you want to add to your order: ");
//            }
//        }
//        return number;
//    }

        static int getValidNumberCustomization(Scanner scanner) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {

            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.print("\nInvalid input. Please try again...\n");
            } else {

                try {
                    input = Integer.parseInt(userInput);

                    validInput = true;


                } catch (NumberFormatException e) {
                    System.out.print("\nInvalid input. Please try again...\n");
                }
            }
        }



        return input;
    }

    static int getValidNumberSystemStart(Scanner scanner, int maxRange) {

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
                    System.out.print("\nInvalid input. Please try again...\n");
                }
            }
        }
        return input;
    }

    }


// static int getValidNumberTEST(Scanner scanner, int maxRange) {
//
//
//        int input = 0;
//        boolean validInput = false;
//
//        while (!validInput) {
//            System.out.print("Enter choice: ");
//            String userInput = scanner.nextLine().trim();
//
//            if (userInput.isEmpty()) {
//                System.out.print("\nInvalid input. Please try again...\n");
//            } else {
//
//                try {
//                    input = Integer.parseInt(userInput);
//
//                    if(input > 0 && input <= maxRange) {
//
//                        validInput = true;
//                    } else {
//                        System.out.print("\nInvalid input. Please try again...\n");
//                    }
//
//                } catch (NumberFormatException e) {
//                    System.out.print("\nInvalid input. Please try again...\n");
//                }
//            }
//        }
//        return input;
//    }

