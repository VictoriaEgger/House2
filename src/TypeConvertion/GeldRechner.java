package TypeConvertion;

import java.util.Scanner;

public class GeldRechner {
    public static void main(String[] args) {
        System.out.println("Bitte gebe einen Betrag in Euro an: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();


        convertToDollar(money);
        convertToYen(money);

    }


    public static void convertToDollar(double eur) { //Kurswechsel von euro in dollar ist 1.29.
        System.out.println("Der Betrag in Dollar beträgt " + eur * 1.29);


    }


    public static void convertToYen (double eur) {
        System.out.println("Der Betrag in Yen ist " + eur * 0.0069);
    }
}
