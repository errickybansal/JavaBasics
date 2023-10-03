package Recurrsion.Basic;

import java.util.ArrayList;

public class CheckAllOccurencesOfElementInArray_concept {
    public static void main(String[] args) {
        int a[] = {1,2,1,3};
        System.out.println(checkPresence(a,1));
    }

    static ArrayList checkPresence(int a[],int v){
        return helper(a,0,v);
    }

    public static ArrayList helper(int[] a, int i, int v) {
        ArrayList<Integer> al = new ArrayList<>();
        if(i==a.length) return al;
       if(a[i]==v) al.add(i);

           ArrayList<Integer> resultFromBelow = helper(a, i + 1, v);
           al.addAll(resultFromBelow);

        return al;
    }
}
