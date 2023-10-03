package Recurrsion.SelfPractice;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNumber(123));
    }

    static int reverseNumber(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n==0) return 0;
        int rem = n%10;
        return (int)(rem*Math.pow(10,digits-1)+helper(n/10,digits-1));

    }

}
