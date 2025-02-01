
public class MeanOfArray {
        public static void main(String[] args) {
            int []nums={1,2,3,4,5,6,7,8,100};
            int n=nums.length;
          int sum=0;
          int mean=  meanOfArray(nums,n-1,sum);
          System.out.println("mean is " +mean);
        }
        static int meanOfArray(int[]nums,int n,int sum){
            int x=nums.length;
        if(n==0){
            sum=sum+nums[n];
            return sum/x;
        }
        sum=sum+nums[n];
        return meanOfArray(nums,n-1,sum); 
        }
    }
