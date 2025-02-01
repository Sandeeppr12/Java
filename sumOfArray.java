
public class sumOfArray {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8};
        int n=nums.length-1;
        int sum=0;
       int res= sumArray(nums,n,sum);
       System.out.print("Result is "+res);
    }
    static int sumArray(int []nums,int n,int sum){
        if(n==0){
            sum=sum+nums[n];
            return sum;
        }
        sum=sum+nums[n];
        return sumArray(nums,n-1,sum);
    }
}
