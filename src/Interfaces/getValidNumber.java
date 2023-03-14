package Interfaces;

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

    static int getValidNumberMain(Scanner scanner, int maxRange) {

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

                    if (input > 0 && input <= maxRange) {

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

                    if (input > 0 && input <= maxRange) {

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

    static int getValidNumber(Scanner scanner, int maxRange) {

        int input = 0;
        boolean validInput = false;

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
                System.out.print("\nInvalid input.Please try again...\n");
            }
        }
        return input;

    }

//    static int getValidNumberTEST(Scanner scanner, int maxRange, boolean isValidInput) {
//
//        int input = 0;
//        String userInput = scanner.nextLine().trim();
//
//        if (userInput.isEmpty()) {
//            System.out.print("\nInvalid input. Please try again...\n");
//
//
//        } else {
//            try {
//                input = Integer.parseInt(userInput);
//
//                if (input > 0 && input <= maxRange) {
//                    return input;
//
//                } else {
//                    System.out.print("\nInvalid input. Please try again...\n");
//                    getValidNumber.getValidNumberTEST(scanner, maxRange);
//                }
//
//            } catch (NumberFormatException e) {
//                System.out.print("\nInvalid input.Please try again...\n");
//                getValidNumber.getValidNumberTEST(scanner, maxRange);
//            }
//        }
//        return input;
//
//    }

    static int getValidNumberInSets(Scanner scanner, int maxRange, String name) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Select " + name + " to your set: ");
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
                    System.out.print("\nInvalid input.Please try again...\n");
                }
            }
        }

        return input;
    }

    static int getValidNumberInSetsSecondItem(Scanner scanner, int maxRange) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Select second position for your set: ");
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
                    System.out.print("\nInvalid input.Please try again...\n");
                }
            }
        }

        return input;
    }

    static int getValidNumberInSetsDrinkItem(Scanner scanner, int maxRange) {

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Select drink you want to add to your set: ");

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
                    System.out.print("\nInvalid input.Please try again...\n");
                }
            }
        }

        return input;
    }
}





