package TypeConvertion;

public class ArrayLottery {

    public static void main(String[] args) {
        int[] myLoterryGuesses = new int[6];

        myLoterryGuesses[0] = 7;
        myLoterryGuesses[1] = 28;
        myLoterryGuesses[2] = 33;
        myLoterryGuesses[3] = 42;
        myLoterryGuesses[4] = 13;
        myLoterryGuesses[5] = 19;

        int[] winningNumbers = getRandomLotteryNumbers();

        int countMaches = 0;

        for (int i = 0; i < myLoterryGuesses.length; i++) {
            if (myLoterryGuesses[i] == winningNumbers[i]) {
                countMaches = countMaches + 1;
            }
        }

        if (countMaches == 6) {
            System.out.println("Jackpot!");
        } else if (countMaches == 5) {
            System.out.println("Second Price!");
        } else if (countMaches == 4) {
            System.out.println("Third Price!");
        } else {
            System.out.println("LOOSER!!!");

        }
    }


    public static int[] getRandomLotteryNumbers() {

        int[] randomNumbers = new int[6];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = (int) (Math.random() * 100);
            while (number > 49 || number < 1) {
                 number = (int) (Math.random() * 100);
            }
            randomNumbers[i] = number;
        }
        return randomNumbers;
    }
}

