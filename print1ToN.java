import java.util.Scanner;

public class print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        print(n);
    }
    static void print(int n){
        if(n==0){
            System.out.print(" " +n);
            return;
        }
            print(n-1);
            System.out.print(" "+n);
        
    }
}
