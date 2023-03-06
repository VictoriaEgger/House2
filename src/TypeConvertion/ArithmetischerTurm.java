package TypeConvertion;

public class ArithmetischerTurm {
    public static void main(String[] args) {

        int zahl = 1;
        int multi = 2;
        int ergebnis = 2;



    }

    public static int loop (int zahl, int multi, int ergebnis) {

        do {
            ergebnis = zahl * multi;
            multi = multi + 1;
            zahl = ergebnis;
            System.out.println(zahl + " * " + multi + " = " + zahl);
        }
        while (multi != 9);

        return ergebnis;

    }
}
