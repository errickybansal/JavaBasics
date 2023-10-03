package Recurrsion.Subset;

public class AllSubsets {
    public static void main(String[] args) {
        String s = "abc";
        subset(s,"");
    }

    public static void subset(String input, String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        subset(input.substring(1),output+ch);
        subset(input.substring(1),output);
    }
}
