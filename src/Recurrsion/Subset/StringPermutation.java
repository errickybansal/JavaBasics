package Recurrsion.Subset;

import java.util.ArrayList;

public class StringPermutation {
    public static void main(String[] args) {

       ArrayList<String> output = permutation("abc","");
        System.out.println(output);
    }

    public static ArrayList<String> permutation(String input, String output){

        if(input.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(output);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i =0;i<=output.length();i++){
            char ch = input.charAt(0);
            String first = output.substring(0,i);
            String last = output.substring(i);
             ans.addAll((permutation(input.substring(1),first+ch+last)));

        }
        return ans;
    }
}
