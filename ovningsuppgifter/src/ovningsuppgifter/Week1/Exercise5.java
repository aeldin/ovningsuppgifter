package ovningsuppgifter.Week1;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Du måste ange exakt 3 argument.");
            return;
        }
        int[] numbers = new int[3];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Du måste ange en siffra, talet blir 0.");
                numbers[i] = 0;
            }
            if (numbers[i] < 0) {
                System.out.println("Du måste ange ett positivt tal, talet blir 0.");
                numbers[i] = 0;
            }
        }

        int max = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println(max);

    }
}
