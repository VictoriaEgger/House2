package TypeConvertion;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Please enter which discount (Senior, Dog, Student): ");


        // Wer ist es?
        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;

        double fullprice = 3.20;        //Voller Preis

        // EInzelne Tickets. Wer ist wer?
        double busTicketEdna = whoBusDiscountPrice(fullprice, true, false, false);
        double busTicketDog = whoBusDiscountPrice(fullprice, false, true, false);
        double busTicketPaul = whoBusDiscountPrice(fullprice, false, false, true);

        // Preis für jeden mal 2, weil sie hin und her fahren.
        double totalBusPrice = 2 * (busTicketDog + busTicketPaul + busTicketEdna);
        double totalBusPriceNoDiscount = 6 * 3.20;      // Ticket Preis ohne Discount


        int fiction = 2;
        int nonFiction = 1;
        double fullBookPrice = 15 + 18 + 23 + 28;

        double totalBookPriceDiscount = getBookDiscountPrice(fullBookPrice, fiction, nonFiction);

        double totalSavedMoney = (fullBookPrice + totalBusPriceNoDiscount) - (totalBusPrice + totalBookPriceDiscount);

        System.out.println("Edna and Paul saved a total of " + totalSavedMoney);

    }


    public static double whoBusDiscountPrice
            (double fullprice, boolean isSenior, boolean isDog, boolean isStudent) { //fullprice muss nicht gleich heißen wie oben der fullprice=3.20.
                                                                                     /*der name bezieht sich nur auf die methode. wenn ich oben jetzt die methode ausführe und mehrer preise hab.
                                                                                      *
                                                                                      */
        //Discount berechnen
        double discountedPrice;

        if (isSenior) {
            discountedPrice = fullprice * 0.85;             //Brauch kein system.out. Dann müsste es ich überall hinzufügen.
        } else if (isDog) {                                 //Mit system.out müsste ich überall extra hinzufügen discountPrice=fullprice*(discount).
            discountedPrice = fullprice * 0.80;
        } else if (isStudent) {
            discountedPrice = fullprice * 0.90;
        } else {
            discountedPrice = fullprice;
        }
        return discountedPrice;        //Ergebniss Ticket Ausgabe. Brauch ich bei double.

    }

    public static double getBookDiscountPrice (double fullBookPrice, int fiction, int nonFiction) {
        double discountBookPrice;

        //Discount Buch berechnen
        if (fiction >= 1 && nonFiction > 2) {
            discountBookPrice = fullBookPrice * 0.90;}
        else {discountBookPrice = fullBookPrice;}

        return discountBookPrice; //Ergebniss Buch Ausgabe. Brauch ich bei double.
        }


    }


