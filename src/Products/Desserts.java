package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desserts {
    private String name;
   private double price;

    private static final ArrayList<Desserts> dessertsList = new ArrayList<>(Arrays.asList(

       new Desserts("Ciastko mango-marakuja", 7.90),
       new Desserts("Ciastko jabłkowe", 7.90),
       new Desserts("Muffin z truskawkami i białą czekoladą", 7.70),
       new Desserts("Muffin z czekoladą", 7.70),
       new Desserts("Zawijas z nugatem", 7.70),
       new Desserts("Croassant maślany", 6.60),
       new Desserts("Croassant kakaowy", 7.70),
       new Desserts("Ciastko słony karmel", 6.60),
       new Desserts("Ciastko owsiane", 6.60),
       new Desserts("Ciastko z kawałkami czekolady", 6.60),
       new Desserts("Lody śmietankowe z polewą czekoldową", 9.90),
       new Desserts("Lody śmietankowe z polewą truskawkową", 9.90),
       new Desserts("Lody śmietankowe z polewą karmelową", 9.90),
       new Desserts("Lody czekoladowe z polewą czekoldową", 9.90),
       new Desserts("Lody czekoladowe z polewą truskawkową", 9.90),
       new Desserts("Lody czekoladowe z polewą karmelową", 9.90),
       new Desserts("McFlurry śmietankowe z posypką Lion", 11.50)));

    public Desserts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString () {

        return name +

                " - " +

                String.format("%.2f", price)

                + " PLN"
                ;

    }
}
