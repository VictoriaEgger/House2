package TypeConvertion;

public class Operatoren {
    public static void main(String[] args) {

        //Is the sun is shining?
        //mit AND => &&
        boolean sunShine = false;
        boolean rain = true;

        System.out.println(sunShine && rain);

        // muss im boolean geschieben sein, weil nur true oder false sein kann. NICHT MIT string!!

        //This excercise confuses me OR I know exactly what this is about
        // oder verwenden => ||

        boolean confused = true;
        boolean knowledge = false;

        System.out.println(confused || knowledge);
        // Eines davon ist wahr, aso ist es wahr.

        //(1 > 3 AND (NOT 3 - 1 < 5)) OR 2 * 2 == 4
       boolean result = 1 > 3 && (!( 3 - 1 < 5)) || 2 * 2 == 4;
        System.out.println(result);

        //(6 >= 2+3 || 2-3 < 0) && (1+1 == 1 && 1 != 1+1)

        boolean result2 = (6 >= 2 * 3 || 2-3 < 0) && (1 * 1 == 1 && 1 != 1 + 1);
        System.out.println(result2);




    }
}
