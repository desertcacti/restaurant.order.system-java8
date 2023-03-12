package Interfaces.Other;

import java.util.Scanner;
//
public interface MyScanner {

    Scanner scanner  = new Scanner(System.in);



    static int myIntScanner() {
        return scanner.nextInt();
    }


    static String myLineScanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }


     static Scanner getNewInstance() {
        return new Scanner(System.in);
    }
}