package Recurrsion.SelfPractice;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        reverseArray(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    static void reverseArray(int a[],int start,int end){
        if(start>end) return;

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverseArray(a,++start,--end);
    }
}
