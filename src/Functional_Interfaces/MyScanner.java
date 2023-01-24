package Functional_Interfaces;

import java.util.Scanner;

public interface MyScanner {

    static int myScanner () {
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }




}
