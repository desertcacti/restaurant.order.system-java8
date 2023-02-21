package Test;

import Interfaces.Other.MyScanner;

public class Test {

    static int flag1 = 0;

    // może spróbuj połączyć z enum?

    public static void main(String[] args) {




            example1();

    }


    static void example1() {

        System.out.println("Podaj case:");
        int choice = MyScanner.myIntScanner();


        switch (choice) {

            case 1:
                if(flag1 == 1) {
                    System.out.println("Case 1 has been already run once");
                    example1();

                } if(flag1 == 0) {
                    System.out.println("Executing first case.");
                    flag1 = 1;
                    example1();
                }
                break;


                case 2:
                    System.out.println("Siemanko");
                    example1();
                break;

        }

    }




}