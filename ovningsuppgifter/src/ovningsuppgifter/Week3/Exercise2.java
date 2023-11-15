package ovningsuppgifter.Week3;

public class Exercise2 {
    public static void main(String[] args) {
        String[] wordList = {"dog", "butt", "game", "boat"};
        int removeIndex = 3;
        String wordToRemove = "butt";


        String[] newArray = removeWord(wordList, removeIndex);

        for (String element : newArray) {
            System.out.println(element + " ");
        }

        String[] newerArray = removeWord(wordList, wordToRemove);

        for (String element : newerArray) {
            System.out.println(element + " ");
        }



    }
    public static String[] removeWord(String[] words, int indexRemoval) {
     if (indexRemoval < 0 || indexRemoval >= words.length)
         return words;

     String[] newWordList = new String[words.length - 1];

     for (int i = 0, j = 0; i < words.length; i++) {
         if (i != indexRemoval) {
             newWordList[j] = words[i];
             j++;
         }
     }
     return newWordList;
    }

    public static String[] removeWord(String[] words, String wordToRemove) {

        if (wordToRemove == null || wordToRemove.isEmpty())
            return words;

        int count= 0;
        for(String word: words) {
            if (!word.equals(wordToRemove)) {
                count++;
            }
        }
        String[] newWordList = new String[count];

        int j = 0;
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                newWordList[j] = word;
                j++;
            }
        }

        return newWordList;

    }
}
