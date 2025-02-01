import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name");
        String name=sc.nextLine();
        print(name);

    }
    public static void print(String name){
        System.out.println("hey "+name);
        print1();
    }

    public static void print1() {
        System.out.println("Helllo world");
        print3();
        
    }
    public static void print3(){
        System.out.println("Hello World");
        print4();
    }
    public static void print4(){
        System.out.println("Hello World");
    }
}