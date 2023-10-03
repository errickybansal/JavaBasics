package Recurrsion.Basic;

import java.util.ArrayList;

public class CheckAllOccurencesOfElementInArray {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,1};
        System.out.println(checkPresence(a,1));
    }

    static ArrayList checkPresence(int a[],int v){
        ArrayList<Integer> al = new ArrayList<>();
        return helper(a,0,v,al);
    }

    public static ArrayList helper(int[] a, int i, int v, ArrayList<Integer> al) {
        if(i==a.length) return al;
       if(a[i]==v) al.add(i);
        return helper(a,i+1,v,al);
    }
}
