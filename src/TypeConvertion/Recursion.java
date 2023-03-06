package TypeConvertion;

public class Recursion {
    public static void main(String[] args) {

        printSentence("Hello! Hilfe", 0);


    }

    public static void doCountDown(int n) {
        if (n != 0) {
            n--;
            System.out.println(n);
            doCountDown(n);
        } else {
            System.out.println("It is done!");

        }
    }

    public static void printSentence (String sentence, int maxNumberofRepetition) {
        if (maxNumberofRepetition != 10) {
            maxNumberofRepetition++;
            System.out.println(sentence);
            printSentence(sentence, maxNumberofRepetition);
        }else {
            System.out.println("It is done!");}


    }
}

