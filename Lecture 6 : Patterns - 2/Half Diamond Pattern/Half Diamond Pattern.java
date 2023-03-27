import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("*");
        int i=1;
        while(i<=n){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println("*");
        }
        i=n;
        while(i>1){
            System.out.print("*");
            int j=1;
            while(j<i){
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            i--;
            System.out.println("*");
        }
        System.out.println("*");
    }
}
