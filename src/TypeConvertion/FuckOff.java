package TypeConvertion;

import java.util.Scanner;

public class FuckOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        String input = scanner.nextLine();

        //input
        // convert o int
        int intNumber = Integer.parseInt(input);
        System.out.println(intNumber);

        // convert to double

        double doubleNumber = Double.parseDouble(input);
        System.out.println(doubleNumber);
    }
}
