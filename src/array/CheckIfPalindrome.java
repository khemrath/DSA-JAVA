package array;

import static array.ArrayUtil.printArray;

public class CheckIfPalindrome {

    public static boolean isPalindrome(String word) {
        char[] wordArray = word.toCharArray();
        int start = 0;
        int end = wordArray.length - 1;
        while(start < end) {
            if(wordArray[start] != wordArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main() {
        String word = "madam";
        System.out.println(word);
        boolean isPalindrome = isPalindrome(word);
        System.out.println(isPalindrome);
    }

}
