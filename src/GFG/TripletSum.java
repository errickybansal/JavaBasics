package GFG;

import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {
        int a[] = {12,8,2,11,5,14,10};
        System.out.println(countTriplet(a,7));
    }

  public static  int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count =0;
        for(int i =n-1; i>= 1 ; i--){
            int front = 0;
            int last = i-1;


            while(front<last){
                int sum = arr[front]+arr[last];
                if(sum==arr[i]){
                    count++;
                    front++;
                    last--;
                }
                else if(sum>arr[i]){
                    last--;
                }
                else{
                    front++;
                }
            }
        }
        return count;
    }
}
