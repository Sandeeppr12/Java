

import java.util.Scanner;

public class printnto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        print(n);
    }
    static void print(int n){
        if(n==0)
        {System.out.print(" "+n); return ;}
        System.out.print(" "+n);
         print(n-1);
    }
}
