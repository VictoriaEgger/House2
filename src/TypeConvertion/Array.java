package TypeConvertion;

public class Array {

    public static void main(String[] args) {

        int [] firstarray = new int [5];

        firstarray [0] = 1;
        firstarray [1] = 2;
        firstarray [2] = 3;
        firstarray [3] = 4;
        firstarray [4] = 5;

//        int [] secondarray = new int [] {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < firstarray.length; i++){
//            int itemInArray = firstarray[i];
//            System.out.println(itemInArray);
//        }
//
//        int[] thirdarray = new int[5];
//        thirdarray[1] = 5;
//
//        for (int i = 0; 1 < thirdarray.length; i++)


        for (int element : firstarray) {
            element = element + 12;
            System.out.println(element);
        }

    }


}
