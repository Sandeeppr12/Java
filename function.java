

import java.util.Scanner;


public class function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        print(n);
    }
    static void print(int n){
        if(n==0){
        System.out.println(n);
        return ;
        }
            
            print(n-1);
            System.out.println(n);
    }
}
