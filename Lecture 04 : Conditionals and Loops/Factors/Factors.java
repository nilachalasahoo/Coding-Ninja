import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<=n/2){
            if(n%i==0)
                System.out.print(i+" ");
            i++;
        }
    }
}
