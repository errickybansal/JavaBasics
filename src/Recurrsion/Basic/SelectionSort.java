package Recurrsion.Basic;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {4,3,2,1};
        selectionSort(a,a.length,0,0);
        System.out.println(Arrays.toString(a));
    }

    static void selectionSort(int a[],int r,int c, int max){
        if(r==0) return;


        if(c<r){
            if(a[max]<a[c]){
                max = c;

            }
            selectionSort(a,r,c+1,max);
        }
        else{
            int temp = a[r-1];
            a[r-1] = a[max];
            a[max] = temp;
            selectionSort(a,r-1,0,0);
        }
    }
}
