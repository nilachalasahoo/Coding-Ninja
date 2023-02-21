import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=1;
        int i=1;
        while(i<=n){
            ans=ans*x;
            i++;
        }
        System.out.print(ans);
    }
}
