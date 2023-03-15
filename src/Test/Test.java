package Test;


import Products.Burger;
import Products.Coffees;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class Test {


    public static void main(String[] args) {

        //PEŁNA NAZWA
        String sample1 = "Jedzony burger super pycha - 20,18 PLN";
        String sample2 = "Jedzony burger super pycha - 9,18 PLN";
        String sample3 = "Jedzony burger super pycha super duper ciper extra max - 9,18 PLN";

        int sample1Length = sample1.length();
        int sample2Length = sample2.length();
        int sample3Length = sample3.length();

        /// Wyciągnięcie nazwy
        int index1 = sample1.indexOf("-");
        int index2 = sample2.indexOf("-");
        int index3 = sample3.indexOf("-");

        int index4 = sample1.lastIndexOf("-");
        int index5 = sample2.lastIndexOf("-");
        int index6 = sample3.lastIndexOf("-");

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(index6);

//        String name1 = sample1.substring(0, index1);
//        String name2 = sample2.substring(0, index2);
//        String name3 = sample3.substring(0, index3);

//        ///Wyciągnięcie ceny
//        String price1AsString = sample1.substring(index1+2, sample1Length-3);
//        String price2AsString = sample2.substring(index2+2, sample2Length-3);
//        String price3AsString = sample3.substring(index3+2, sample3Length-3);
//        double price1 = Double.parseDouble(price1AsString.replace(',','.'));
//        double price2 = Double.parseDouble(price2AsString.replace(',','.'));
//        double price3 = Double.parseDouble(price3AsString.replace(',','.'));
//
//        ///Wyświetlanie
//        System.out.println(name1 + " - " + String.format("%.2f",price1) + " PLN");
//        System.out.println(name2 + " - " + String.format("%.2f",price2)+ " PLN");
//        System.out.println(name3 + " - " + String.format("%.2f",price3) + " PLN");
    }


}