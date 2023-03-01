package TypeConvertion;

public class IfElse {
    public static void main(String[] args) {

        boolean isSenior = false; // muss oben im main sein wenn ich die methode schreibe
        boolean isDog = false;
        boolean isStudent = false;

 checkIfDiscount(isSenior, isDog, isStudent); //Methode
 checkIfDiscount( true,  false,  true);//Hilft uns damit wir wissen was es ist
 checkIfDiscount( false,  false,  true);
 checkIfDiscount( false,  true,  true);
 checkIfDiscount( false,  false,  false);









 // In a bookshop you recieve a discount if you buy more than 2 non-fiction books and at least one fiction book.

        boolean moreNoneFicion = true;
        boolean oneFiction = false;

        // beide sollen wahr sein sonst gibts keine discount

        if (moreNoneFicion && oneFiction) {
            System.out.println("Discount");
        }
        else {
            System.out.println("Kein Discount");

        }

        //oder

        int fiction = 1;
        int nonfiction = 3;

    checkBookDiscount(fiction, nonfiction);
    checkBookDiscount( 1,  3);
    checkBookDiscount( 0,  0);


    }

    public static void checkIfDiscount (boolean isSenior, boolean isDog, boolean isStudent){ //Methode

        if (isSenior) {                                       //Hier die wird der code für die Methode hingeschrieben
            System.out.println("Discount");                   // unterhalb vom main
        } else if (isDog) {
            System.out.println("Discount");
        } else if (isStudent) {
            System.out.println("Discount");

        } else {
            System.out.println("Kein Discount");
            // werden einzeln gecheckt


        }
    }

    public static String checkBookDiscount (int fiction, int nonfiction){    //oben als String -> braucht returnwert

        String discount = "Discount";               // Kann oben auch festgelegt werden
        String noDiscount = "Kein Discount";

        if (fiction > 0 && nonfiction >= 3) {// größer als null UND mehr als zwei (also ab 3 zählen)
            return discount;
        } else {
            return noDiscount;
        }

    }

    }




