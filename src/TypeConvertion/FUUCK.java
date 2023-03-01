package TypeConvertion;

import java.util.Scanner;

public class FUUCK {
    public static void main(String[] args) {
        // Zwei SCanner

        Scanner scanner = new Scanner (System.in);
        System.out.println ("PLease show fucking number");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please another String: ");
        String name2 = scanner1.nextLine();

        System.out.println("Both entries are the same: " + name.equals(name2));

        System.out.println();
    }
}
