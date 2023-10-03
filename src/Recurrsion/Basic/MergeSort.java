package Recurrsion.Basic;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {6,4,2,1};
        int[] result = sort(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int a[]){
        if(a.length==1){ return a;}

        int mid = a.length/2;
        int[] left = sort(Arrays.copyOfRange(a,0,mid));
        int[] right = sort(Arrays.copyOfRange(a,mid,a.length));

        return mergeTwoArrays(left,right);
    }

    public static int[] mergeTwoArrays(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j]){
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k]=left[j];
            j++;
            k++;
        }
        return result;
    }

}
