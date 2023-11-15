package ovningsuppgifter.Week2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        int smallest = findSmallestNumber(75, 67, 54);

        System.out.println(smallest);
    }

    public static int findSmallestNumber(int nr1, int nr2, int nr3) {

       return Math.min(Math.min(nr1, nr2), nr3);

    }

}
