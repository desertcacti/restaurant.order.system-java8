package FinalizationOrder;

public class Finalization {



   public static void finalizationOfOrder () {

        System.out.println("Elements in your Cart:");
        CartList.printCartList();
        System.out.print("\nTotal sum of your Cart is: ");
        System.out.printf("%.2f", CartList.getCartValue());     //write it simple please
        System.out.print(" PLN");
        //Customization method
        System.out.println("\nDo you want to customize your order? ");


         // yes / no


       // then finalize if no
       // choose payment method











    }




    static void choosePaymentMethod () {




    }





}
