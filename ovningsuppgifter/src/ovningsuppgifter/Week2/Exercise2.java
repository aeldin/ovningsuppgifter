package ovningsuppgifter.Week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

    public static boolean isPasswordValid(String password){

       return Pattern.compile("^(?=.*?[0-9]{2}).{10,}$")
                .matcher("-Secr3t.")
                .find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        isPasswordValid(password);

        boolean isMatch = isPasswordValid(password);

        if (isMatch) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }


    }
}
