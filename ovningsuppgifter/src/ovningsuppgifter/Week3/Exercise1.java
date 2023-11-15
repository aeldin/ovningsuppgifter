package ovningsuppgifter.Week3;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 4, 1, 8,};

            checkForOddNumbers(numbers);

    }
    public static void checkForOddNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 != 0)
                throw new RuntimeException("There is an odd number in the array, " + num);
        }
        System.out.println("There are no odd numbers in the array");

        }

    }

