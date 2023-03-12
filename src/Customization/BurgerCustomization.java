package Customization;

import FinalizationOrder.CartList;
import AddToCart.AddBurgerToCart;
import Interfaces.Other.MyScanner;
import Interfaces.Other.getValidNumber;
import Products.Burger;

import java.util.Scanner;

public class BurgerCustomization implements getValidNumber {

    static int flag1 = 0;
    static int flag2 = 0;
    static int flag3 = 0;
    static int flag4 = 0;
    static int flag5 = 0;
    static int flag6 = 0;


    public static void burgerCustomization() {

        System.out.println("Do you want to customize selected item? Y/N");
        String decision = MyScanner.getNewInstance().nextLine();

        switch(decision) {

            case "Y":
                displayBurgerAdditions();
                yesChosen();
                break;


            case "N":
                AddBurgerToCart.addBurgerToCart();
                break;

            default:
                System.out.println("Please try again...");
                burgerCustomization();
                break;

        }


    }

    public static void yesChosen() {

        int choice = getValidNumber.getValidNumberCustomization(MyScanner.getNewInstance(),7, "burger");

            switch (choice) {

                case 1:
                    if(flag1 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                        break;

                    } if (flag1 == 0) {
                            CartList.addToCartValue(4.00);
                            System.out.println("\n4.00 PLN added to bill");
                            flag1 = 1;
                            yesChosen();
                            break;
                }
                    break;


                case 2:

                if(flag2 == 1) {
                    System.out.println("\nAddition has already been added once");
                    yesChosen();
                    break;
                } if (flag2 == 0) {
                    CartList.addToCartValue(0.50);
                    System.out.println("\n0.50 PLN added to bill");
                    flag2 = 1;
                    yesChosen();
                    break;
                }
                    break;

                case 3:

                    if(flag3 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                        break;
                    } if (flag3 == 0) {
                    CartList.addToCartValue(0.50);
                    System.out.println("\n0.50 PLN added to bill");
                    flag3 = 1;
                    yesChosen();
                    break;
                }
                    break;

                case 4:
                    if(flag4 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                        break;
                    } if (flag4 == 0) {
                    CartList.addToCartValue(0.50);
                    System.out.println("\n0.50 PLN added to bill");
                    flag4 = 1;
                    yesChosen();
                    break;
                }
                    break;

                case 5:
                    if(flag5 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                        break;
                    } if (flag5 == 0) {
                    CartList.addToCartValue(0.50);
                    System.out.println("\n0.50 PLN added to bill");
                    flag5 = 1;
                    yesChosen();
                    break;
                }
                    break;

                case 6:
                    if(flag6 == 1) {
                        System.out.println("\nAddition has already been added once");
                        yesChosen();
                    } if (flag6 == 0) {
                    CartList.addToCartValue(0.50);
                    System.out.println("\n0.50 PLN added to bill");
                    flag6 = 1;
                    yesChosen();
                    break;
                }
                    break;

                case 7:
                    setFlagsOnNull();
                    Burger.displayBurgerMenu();
                    AddBurgerToCart.addBurgerToCart();
                    break;

            }

        }
//    }

  public  static void displayBurgerAdditions() {
        System.out.println("Additions:\n\n1.Meat - 4.00 PLN\n2.Sauce - 0.50 PLN\n3.Lettuce - 0.50 PLN\n4.Cheddar - 0.50 PLN\n5.Pickles - 0.50 PLN\n6.Onion - 0.50 PLN\n\n7.End customization\n");
    }

    private static void setFlagsOnNull() {

        flag1 = 0;
        flag2 = 0;
        flag3 = 0;
        flag4 = 0;
        flag5 = 0;
        flag6 = 0;

    }





}
