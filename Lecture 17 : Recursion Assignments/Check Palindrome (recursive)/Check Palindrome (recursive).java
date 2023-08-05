public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n=str.length();
        if(n<=1)
            return true;
        if(str.charAt(0)==str.charAt(n-1))
            return isPalindrome(str.substring(1, n-1));
        else
            return false;
    }
}
