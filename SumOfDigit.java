
public class SumOfDigit {
    public static void main(String[] args) {
       int n= 123456;
      int x= count(n);
      System.out.println(x);
    }
    static int count(int n){
        if(n==0)return n;
        return n%10+ count(n/10);
    }
}
