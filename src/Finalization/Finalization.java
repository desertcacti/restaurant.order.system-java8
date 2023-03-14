package Finalization;

//import Functional_Interfaces.Other.Customization;

public class Finalization {



   public static void finalizationOfOrder () {

        System.out.println("\nElements in your Cart: ");
        CartList.printCartList();
        System.out.printf("\nTotal sum of your Cart is: %.2f PLN", CartList.getCartValue());





    }




    static void choosePaymentMethod () {




    }





}
