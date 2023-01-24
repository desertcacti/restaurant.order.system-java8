package Functional_Interfaces;

import java.util.ArrayList;
import java.util.Scanner;


/// NIE WIEM JAK TO ZAIMPLEMENTOWAĆ!  ?????? - ALE PO CHWILI DAJE RADE... KEEP IT GOIN!

public interface addItem_toBill <E> {



    static <E> void addItemToBill (ArrayList<E> currentArrayList) {

        int sizeOfCurrentList = currentArrayList.size();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");

        int choice = sc.nextInt();

        if(choice > 0 && choice <= sizeOfCurrentList)

        switch(choice) {







        }




    }






}
