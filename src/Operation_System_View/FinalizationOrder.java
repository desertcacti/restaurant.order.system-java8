package Operation_System_View;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class FinalizationOrder <T> {

    private T Object;

    private ArrayList<T> Cart = new ArrayList<>();

    static FinalizationOrder test = new FinalizationOrder();


    double finalAmount = 00.00;


    void addToTheList(T Object) {

        Cart.add(Object);

    }


    void printCartList1(){

        int c = 1;

        System.out.println("Elements in your Cart:\n ");

        for (Object T : Cart) {

            System.out.println(c + "." + T);
            c++;


        }







    }


    void printCartList() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        int c = 1;

        System.out.println("Elements in your Cart:\n ");

        for (Object T : Cart) {

            System.out.println(c + "." + T);
            c++;


        }

        // miejsce na wklejenie opcji Customize //

//        System.out.println("\n" + c + "." + "Customize position");
//        System.out.println((c+1) + "." + "Delete position");


//        System.out.println("\nC.Customize position\nD.Delete position\nEnter your choice: ");
//
//        char char1 = sc.next().charAt(0);
//
//        switch(char1) {
//
//            case 'C':
//
//
//                System.out.println("click C");
//                break;
//
//            case 'D':
//                System.out.println("Click D");
//
//                break;
//
//
//        }




        // switch pomiędzy przedmiotami z listy
        //////////////////////////////////////////

        System.out.print("\nTotal sum of your order: ");
        System.out.printf("%.2f", FinalizationOrder.test.finalAmount);
        System.out.print(" PLN");




        Continue();




    }



    void customizeFunctionality() {

// znowu kod dotyczący drukowania listy

        int c = 1;

        for (Object T : Cart) {

            System.out.println(c + "." + T);
            c++;


        }





    }


    void Continue() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to finalize? Yes/No");

        String answer = sc.next();

        switch (answer) {

            case "Yes":
                choosePayOption();
                break;

            case "No":
                System.out.println("Do you want to back to Menu? Yes/No");
                String answer2 = sc.next();

                switch (answer2) {
                    case "Yes":
                        displayView.Start();
                        break;

                    case "No":
                        printCartList();
                        break;
                }
                break;
        }
    }


    void choosePayOption() throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose pay option:\n1.Money\n2.Card");

        int choose = sc.nextInt();

        switch (choose) {

            case 1:
                moneyPayOption();
                System.out.println("\nThank you! Your estimated time to receive the order is: " );
                break;


            case 2:

                cardPaymentSystem();
                break;


        }

    }



    void moneyPayOption() {

        Scanner sc = new Scanner(System.in);

        double rest = 00.00;

        System.out.println("Total bill: ");
        FinalAmountToString();

        System.out.println("Enter amount of money: ");

        double amount = sc.nextDouble();

        if (!isInsufficient(amount)) {
            System.out.println("Amount insufficient.");
            moneyPayOption();

        } else {

            rest = amount - finalAmount;
            System.out.println("Rest of money: ");
            System.out.printf("%.2f", rest);
            System.out.println(" PLN");

        }
    }



    boolean isInsufficient(double d) {

        return (d >= finalAmount);

    }

    //public static

    void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch : data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }




    void cardPaymentSystem() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAccept the card charge:\n1.Accept\n2.Decline");

        int choice = sc.nextInt();


        switch (choice) {

            case 1:
                printWithDelays("1.2.3.4.5... - COMPLETED", TimeUnit.MILLISECONDS, 100);
                System.out.println("\nThank you! Your estimated time to receive the order is: " );
                break;




            case 2:
                System.out.println("Payment Declined");
                moneyPayOption();
                break;



        }

    }

    void farewell() {
        System.out.println("Thank you for be with us. Take care!");
    }


    public void FinalAmountToString() {
        System.out.printf("%.2f", finalAmount);
        System.out.println(" PLN");

    }




    @Override
    public String toString() {
        return "1."
                + Object +
                ", finalizationOrder=" + Cart +
                '}';
    }


    public void cartDisplay (ArrayList Cart) {




    }


//
//    public boolean checkDuplicateElements() {
//
//
//
//
//
//
//    }



}
