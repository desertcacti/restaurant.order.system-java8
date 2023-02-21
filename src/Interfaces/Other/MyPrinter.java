package Interfaces.Other;

import java.util.Collection;

public interface MyPrinter<T> {

    static <T> void productListPrinter(Collection<T> array) {
        int i = 1;
        for(T element : array) {
            System.out.println("" + i + "." + element);
            i++;
                }
            }
    }


