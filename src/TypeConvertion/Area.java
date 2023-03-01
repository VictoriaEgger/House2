package TypeConvertion;

public class Area {
    public static void main(String[] args) {

        double area1 = calculateArea (2.1, 3.6);
        double area2 = calculateArea (6.1, 7.6);

        if (area1 > area2) {
            System.out.println("Area 1 is bigger!");
        }
        else {
            System.out.println("Area 2 is bigger!");
        }


    }

    public static double calculateArea (double length, double breadth) {

        double area = length + breadth;
        return area;
    }
}
