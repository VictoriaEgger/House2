package TypeConvertion;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Gib eine Zahl ein: ");
//        double number = scanner1.nextDouble();
//
//        double result = number % 3;
//
//        if (result == 0) {
//            System.out.println("Kann durch 3 dividiert werden");
//        } else {
//            System.out.println("Kann nicht durch 3 dividiert werden");
//        }


//    Scanner scanner1 = new Scanner(System.in);
//    System.out.println("Gib eine Zahl ein: ");
//    double number = scanner1.nextDouble();
//
//    int numberTwo = 3;
//    int result = number % numberTwo;
//
//    if (result == 0) {
//        System.out.println("The number is divisible by 3");
//    } else
//
//    {
//        System.out.println("The number is not divisble by 3");
//    }

        // Ich will wissen welche Zahlen durch 3 dividierbar ist.

        int dividend = 17;
        int divisor = 9;
        int resultOfDevisible = isDivisible(dividend, divisor);
        if (resultOfDevisible != 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        }
    }

    public static int isDivisible(int dividend, int diviser) {  //Methode um herauszufinden, welche Zahl durhc 3 teilbar ist
        int restFromDivision = dividend % diviser;

        int returnValue = 0;

        if (restFromDivision == 0) {
            returnValue = dividend;                    // Beid Zweige (if, else) müssen mit return abgedeckt sein
        }
        return returnValue;
    }
}


