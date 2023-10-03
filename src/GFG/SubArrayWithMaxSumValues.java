package GFG;

public class SubArrayWithMaxSumValues {

    public static void main(String[] args) {
        int a[] = {12,8,-2,-11,5,-14,10};
        System.out.println(maxSumSubArray(a,7));
    }

    public static int maxSumSubArray(int a[],int n){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0;i<n;i++){
            sum = sum +a[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
