package Strings;

import static Strings.reversingAString.reverse;

public class palindrome {

    public static void main(String args[]) {
        System.out.println("Is aaa palindrom?: " + isPalindromString("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromString("abc"));
        System.out.println("Is bbbb palindrom?: " + isPalindromString("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromString("defg"));
    }



    public static boolean isPalindromString(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }

}
