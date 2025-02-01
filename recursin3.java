

import java.util.Scanner;
public class recursin3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int n=sc.nextInt();
       int x=sc.nextInt();
       print(n,x);
    }
    static void print(int n,int x){
        if (n==x) {
            System.out.println(n);
            return;
            
        }
        System.out.println(n);
        print(n+1,x);

    }
}
