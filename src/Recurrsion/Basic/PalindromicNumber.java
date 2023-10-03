package Recurrsion.Basic;

public class PalindromicNumber {

    public static void main(String[] args) {
        System.out.println(palindrome(1221));
    }

    public static boolean palindrome(int n){
        return (n==ReverseANumber.rev(n));
    }
}
