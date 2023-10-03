package Recurrsion.Subset;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets_Iteration {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> output = subsetIteration(a);
        for (List<Integer> ans: output
             ) {
            System.out.println(ans);
        }
    }

    public static List<List<Integer>> subsetIteration(int a[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:a){
            int n = outer.size();
            for (int i =0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
