package Functional_Interfaces.Other;

import java.util.Scanner;

public interface MyScanner {

    static int myIntScanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    static String myLineScanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

}
