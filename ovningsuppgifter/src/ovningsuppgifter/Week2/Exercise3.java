
package ovningsuppgifter.Week2;

public class Exercise3 {

    public static boolean isPalindrome(String word) {

        String reverse = "";

        boolean answer = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            answer = true;
        }
        return answer;
    }
    public static boolean isPalindrome(int number) {
        String reverse = "";
        String number2 = Integer.toString(number);
        boolean secondAnswer = false;

        for (int i = number2.length() - 1; i >= 0; i--) {
            reverse = reverse + number2.charAt(i);
        }
        if (number2.equals(reverse)) {
            secondAnswer = true;
        }
        return secondAnswer;

    }

    public static void main(String[] args) {

        String word = "abba";
        int number = 1441;
        isPalindrome(word);
        isPalindrome(number);

        word = word.toLowerCase();
        boolean answer = isPalindrome(word);
        System.out.println(answer);

        boolean secondAnswer = isPalindrome(number);
        System.out.println(secondAnswer);



    }
}
