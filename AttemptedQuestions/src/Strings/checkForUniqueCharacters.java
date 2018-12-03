package Strings;

public class checkForUniqueCharacters {

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + checkIfUnique(word));
        }
    }

    public static  boolean checkIfUnique(String str){
        boolean[] char_set = new boolean[256];
        for(int i =0; i<str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;

        }
return true;
    }


}
