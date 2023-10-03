package Recurrsion.SelfPractice;

public class CountZerosInString {
    public static void main(String[] args) {
        String s = "10";
        countZeros(s);
    }


    public static void countZeros(String s){
        System.out.println(helper(s,0));

    }

    public static int helper(String s,int count){
        if(s.isEmpty()){
            return count;
        }
        if(s.charAt(0)=='0'){
            return helper(s.substring(1),++count);

        }
        else {
           return helper(s.substring(1),count);
        }


    }
}
