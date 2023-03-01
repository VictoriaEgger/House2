package TypeConvertion;

public class Uebung {
    public static void main(String[] args) {

        String name = "Victoria";
        String job = "Studentin";
        String adresse = "Hautpstraße 69, 8141 Premstätten";
        int alter = 27;
        String birthday = "13.03.1995";


showGreeting();

        System.out.println("Mein Name ist " + name + ". Ich bin " + job + " und wohne in " + adresse + ".");
        System.out.println("Ich bin derzeit " + alter + " Jahre alt und habe am " + birthday + " Geburtstag. ");
    }

    public static void showGreeting() {

        int stunde = 16;

        if (stunde < 12) {
            System.out.println("Guten Morgen!");
        } else if (stunde >= 12 && stunde <= 16) {
            System.out.println("Mahlzeit!");
        }
        else {
            System.out.println("Guten Abend!");
        }

    }
}

