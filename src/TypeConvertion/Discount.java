package TypeConvertion;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter which discount (Senior, Dog, Student): ");
 whoGetsDiscount = scanner.nextLine();


        // Wer ist es?
        boolean Senior = true;
        boolean Dog = true;
        boolean Student = true;

        // Welchen Discount?

//        double fullprice = 3.20;
//        double discountSenior = 0.15;
//        double discountDog = 0.20;
//        double discountStudent = 0.10;

        //Ausgeben

//        whoGetsDiscount( true,  false,  true);

    }


    public static void whoGetsDiscount
            (boolean Senior, boolean Dog, boolean Student) {

        if (Senior) {
            System.out.println("Discount price for Seniors is: " + 3.20 * 0.15);
        } else if (Dog) {
            System.out.println("Discount price for Dogs is: " + 3.20 * 0.20);
        } else if (Student) {
            System.out.println("Discount price for Students is: " + 3.20 * 0.10);
        } else {
            System.out.println("No Discount available.");
        }


    }
}

