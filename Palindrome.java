package SoftGroupTest;

public class Palindrome {
    public Palindrome() {
    }

    public static boolean isPalindrome(String input) {
        boolean result = input != null;
        if(result) {
            input = input.toLowerCase();
            int left = 0;
            int right = input.length() - 1;

            while(left < right) {
                if(input.charAt(left++) != input.charAt(right--)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
