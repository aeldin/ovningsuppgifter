package ovningsuppgifter.Week2;


import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        int input = 0;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Ange ett giltigt tal");

            }
        }
    }

    public static boolean isBoolean() {
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("j") || input.equals("ja") || input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("nej") || input.equals("no")) {
                return false;
            } else {
                System.out.println("Felaktig inmatning.");
            }

        }
    }

    public static double getDouble() {
        while (true) {
            try {
                double input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Ange ett giltigt tal");
            }
        }
    }

    public static float getFloat() {
        while (true) {
            try {
                float input = Float.parseFloat(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Ange ett giltigt tal");
            }
        }
    }

    public static String getString() {
        String input = scanner.nextLine();
        return input;
    }

    public static String getString(String[] validOptions) {
        while (true) {
            String input = scanner.nextLine();
            for (String option : validOptions) {
                if (input.equalsIgnoreCase(option)) {
                    return input;
                }
            }
            System.out.println("Felaktig inmatning. Giltiga val är:");
            for (String option : validOptions) {
                System.out.println(option);
            }
            System.out.println("Försök igen:");
        }
    }







    public static void main(String[] args) {

        System.out.println("Ange ett heltal:");
        int num = Input.getInt();
        System.out.println("Du angav: " + num);

        System.out.println("Svara med J/N eller Yes/No:");
        boolean bool = Input.isBoolean();
        System.out.println("Your answer is: " + bool);

        System.out.println("Ange ett decimaltal:");
        float decimal = Input.getFloat();
        System.out.println("Du angav: " + decimal);

        System.out.println("Ange ett decimaltal (double):");
        double dbl = Input.getDouble();
        System.out.println("Du angav: " + dbl);

        System.out.println("Ange en sträng:");
        String str = Input.getString();
        System.out.println("Du angav: " + str);

        System.out.println("Välj ett alternativ (A/B/C):");
        String option = Input.getString(new String[]{"A", "B", "C"});
        System.out.println("Du valde: " + option);


    }
}
