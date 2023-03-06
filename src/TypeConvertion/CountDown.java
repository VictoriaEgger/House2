package TypeConvertion;

public class CountDown {
    public static void main(String[] args) {

        int i = 0;

        forLoop(i);


    }

    public static void countdown(int i) {

        while (i >= 0) {
            System.out.println(i);
            i = i - 1;

        }
    }

    public static void doCount(int i) {

        do {
            System.out.println(i);
            i = i + 1;
            System.out.println(i);
        }
        while (i != 100);
    }

    public static void loopONE(int i) {

//        do {
//            System.out.println(i);
//        }                                                  //Hier muss sich i ändern, damit i==1 nicht immer wahr ist.
//        i++;
//        while (i == 1) ;

    }

    public static void loopTWO(int i) {

//       ANGABE:  while (true) {
//            System.out.println(1);

        while (i < 2) {
            System.out.println(1);
            i++;
        }
    }

    public static void forLoop (int i) {
        int summe = 0;

        for (i = 1; i <= 10; i++) {
            summe = summe + i;
        }

        System.out.println(summe);
    }
}



