public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        if(n<10)
            return 1;
        return 1+countDigits(n/10);
    }
}
