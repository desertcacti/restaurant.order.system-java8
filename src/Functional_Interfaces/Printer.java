package Functional_Interfaces;

import java.util.Collection;

public interface Printer<T> {

    static <T> void print(Collection<T> array) {

        for(T element : array) {
            System.out.println(element);
                }
            }




    }


