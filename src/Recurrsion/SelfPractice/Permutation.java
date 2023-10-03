package Recurrsion.SelfPractice;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
    }

    public static void perm(String output,String input){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
            char ch = input.charAt(0);
        for (int i =0; i<=output.length();i++){
            perm(input.substring(i)+ch+output,input.substring(1));
        }
    }
}
