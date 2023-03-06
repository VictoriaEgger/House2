package TypeConvertion;

public class Account {
    public static void main(String[] args) {

        int years = 10;
        double investment = 2000.00;
        double interestRate = 0.025;

        calculateAccountBalance(years, investment, interestRate);  //Ausgabe

    }

    public static double calculateAccountBalance(int years, double investment, double interestRate) {
        double accountBalance = investment;                     //Rückgabewert double und wieviel balance haben wir am anfang am konto? =2000
                                                                // Brauche i weil es di jahre raufzählt. Ist nicht das gleiche wie meine fetsgelegten jahre
        for (int i = 1; i <= years; i++) {             // Soll für jedes Jahr (10 jare oben angegebn) unsere accountBalance berechnen. int für i dazu, weil ich es vorher nirgends angegeben hab.
            accountBalance = accountBalance + (accountBalance * interestRate);
            System.out.println(accountBalance + " Euros in years " + i);
        }
        return accountBalance;  // Gibt uns den neuen accountBalance aus. bruacht man bei double.
    }
}

