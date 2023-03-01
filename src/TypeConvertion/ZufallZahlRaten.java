package TypeConvertion;

public class ZahlenRaten {

    static int myNumber = 42;                    // Welche Zahl ist gesucht?

    public static void main(String[] args) {

        guess(41);                         //Methode im main eingeben und Zahl zum raten eingeben. Nur die Zahl! Verbindet automatisch.
        guess(42);


    }

    public static void guess(int number) {            //Wird die Zahl richtig geraten oder nicht? Vergleicht meine vorbestimmte Zhal mit der in der Kommandozeile.
        if (number == myNumber) {
            System.out.println("Richtig geraten!");
        } else {
            System.out.println("Leider falsch. Versuch es nocmal.");


        }
    }
}