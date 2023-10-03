package Recurrsion.Basic;

public class CheckArraySortedOrNot
{
    public static void main(String[] args) {
        int a[] = {1,2,5,4,5};
        System.out.println(sorted(a));
    }

    static boolean sorted(int a[]){

        return helper(a,1);

    }

    public static boolean helper(int[] a, int i) {
        if(i==a.length) return true;

        if(a[i]>a[i-1]){
            return helper(a,i+1);
        }
        return false;
    }

}
