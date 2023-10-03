package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumMap {

    public static void main(String[] args) {
        int a[] = {0,1,3,7,5};
        System.out.println( subarraySum(a,5,11));
    }

    public static ArrayList<Integer> subarraySum(int a[],int n, int s){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        ArrayList<Integer> result = new ArrayList<>();
            int sum = 0;
        for(int i =0; i<n;i++){
            sum = sum +a[i];


            if(map.containsKey(sum-s)){
                if(sum-s==0){
                    result.add(1);
                    result.add(i+1);
                    return result;
                }

                result.add(map.get(sum-s)+1);
                result.add(i+1);
                return result;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i+1);
            }

        }

        return null;
    }
}
