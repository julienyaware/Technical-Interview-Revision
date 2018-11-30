package Strings;
import java.util.HashMap;


// Java program to find first non-repeating character
// Note : hashmap is used


public class findFirstNonRepeatedCharacter {

    public static  void main(String[] args){
        String testWord = "swiss";
        firstNonRepeatedCharacter(testWord);
    }

    public static char firstNonRepeatedCharacter(String word)
    {
        HashMap<Character,Integer> scoreboard = new HashMap<>();
// build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c))
            {
                scoreboard.put(c, scoreboard.get(c) + 1);

            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {

                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }


}



