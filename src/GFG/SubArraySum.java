package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(s==0) {

            return (ArrayList<Integer>) Arrays.asList(-1);
        }
        int sum = 0;
        int left = 0;
        boolean found = false;
        for (int right = 0;  right < n; right++) {

            sum = sum + arr[right];
            while (sum > s) {
                sum = sum-arr[left++];

            }
            if (sum == s) {
                result.add(left+1);
                result.add(right+1);
                found = true;
                break;
            }

        }
        if (found == false) {
            result.add(-1);
        }


        return result;
    }

    public static void main(String[] args) {
        int a[] = {1,0,3,7,5};
        System.out.println( subarraySum(a,5,12));
    }
}
