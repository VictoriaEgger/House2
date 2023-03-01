package House;

public class LivingRoom {
    public static void main(String[] args) {
        // squareMeters
        int squareMeters;
        // pricePerSquareMeter
        double pricePerSquareMeter;
        //address
        String address;

        //Print out the cost of the house (squareMeters * pricePerSquareMeter) at (address).

        squareMeters = 175;
        pricePerSquareMeter = 5.5;
        address = "Hauptstraße 69, 8141 Premstätten";

        System.out.println("The price of the house at " + address + " is: " +squareMeters * pricePerSquareMeter);


    }
}
