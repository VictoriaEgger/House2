package TypeConvertion;

import java.util.Scanner;

public class GetGrade {
    public static void main(String[] args) {
        Scanner enterGrade = new Scanner (System.in);
        int grade = 0;
        System.out.print("Enter grade: ");

        grade = enterGrade.nextInt();
        System.out.println(grades(grade));

//        System.out.println(grades(1));
//        System.out.println(grades(2));
//        System.out.println(grades(3));
//        System.out.println(grades(4));
//        System.out.println(grades(5));

    }


    public static String grades(int grade) {

        return switch (grade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            case 5 -> "Fail";
            default -> "WTF?!?";
        };
    }
}
