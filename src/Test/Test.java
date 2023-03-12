package Test;

import Customization.BurgerCustomization;
import Interfaces.Other.MyScanner;
import Products.Burger;

import java.util.Scanner;

import static Interfaces.Other.MyScanner.scanner;

public class Test {

    public static void main(String[] args) {
        // próbuje zrobić deafulk t z choiceów



        }







    }


//    public static void getValidationTEST() {
//
//        int input = 0;
//
//        while (input == 0) {
//            System.out.print("Enter an integer: ");
//            String line = MyScanner.getNewInstance().nextLine().trim();
//
//            if (!line.isEmpty()) {
//                try {
//                    input = Integer.parseInt(line);
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input, please enter an integer.");
//                }
//            }
//        }
//
//        System.out.println("You entered: " + input);
//    }


//    static int getValidNumberTEST(Scanner scanner, int maxRange) {
//
//        int number = 0;
//        boolean validInput = false;
//
//        while (number == 0) {
//            System.out.print("Enter choice: ");
//            String line = MyScanner.getNewInstance().nextLine().trim();
//
//            if (!line.isEmpty()) {
//                try {
//                    number = Integer.parseInt(line);
//                } catch (NumberFormatException e) {
//                    System.out.print("\nInvalid input. Please try again...\n");
//                }
//            }
//        }
//
//            while (!validInput) {
//                System.out.print("Enter choice: ");
//
//                if (scanner.hasNextInt()) {
//                    number = scanner.nextInt();
//
//                    if (number > 0 && number <= maxRange) {
//                        validInput = true;
//
//                    } else {
//                        scanner.nextLine(); // discard invalid input
//                        System.out.print("\nInvalid input. Please try again...\n");
//                    }
//
//                } else {
//                    scanner.nextLine(); // discard invalid input
//                    System.out.print("\nInvalid input. Please try again...\n");
//                }
//            }
//            return number;
//        }


//       public static int getValidNumberTEST (Scanner scanner,int maxRange){
//
//
//            int input = 0;
//            boolean validInput = false;
//
//            while (!validInput) {
//
//                System.out.print("Enter choice ");
//                String userInput = scanner.nextLine();
//
//                try {
//
//                    input = Integer.parseInt(userInput);
//                    validInput = true;
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input. Please enter an integer.");
//                }
//            }
//
//            return input;
//
//        }
//    }

//
//    public static int getValidNumberTEST(Scanner scanner, int maxRange) {
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
//                System.out.println("Invalid input. Please enter an integer.");
//            } else {
//                try {
//                    input = Integer.parseInt(userInput);
//                    validInput = true;
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input. Please enter an integer.");
//                }
//            }
//        }
//        return input;
//    }


    //
//    public static int getValidNumberTEST(Scanner scanner, int maxRange) {
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
//                System.out.println("Invalid input. Please enter an integer.");
//            } else {
//
//                try {
//                    input = Integer.parseInt(userInput);
//
//                    if(input > 0 && input <= maxRange) {
//
//                        validInput = true;
//                    } else {
//                        System.out.println("Invalid input. Please enter an integer.");
//                    }
//
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input. Please enter an integer.");
//                }
//            }
//        }
//        return input;
//    }
//}


