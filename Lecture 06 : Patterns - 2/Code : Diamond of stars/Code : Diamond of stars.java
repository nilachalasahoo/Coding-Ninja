import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
        int k=(n+2)/2;
		while(i<=k){
			int j=1;
			while(j<=(k-i)){
				System.out.print(" ");
				j++;
			}
            j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			j=1;
			while(j<i){
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
        i=1;
        k=(n-1)/2;
        while(i<=k){
			int j=1;
			while(j<=i){
				System.out.print(" ");
				j++;
			}
            if(n%2==0){
                System.out.print(" ");
            }
            j=1;
			while(j<=k-i){
				System.out.print("*");
				j++;
			}
			j=1;
			while(j<=k-i+1){
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
        
    }
}
