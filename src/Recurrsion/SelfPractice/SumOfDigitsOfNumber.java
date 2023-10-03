package Recurrsion.SelfPractice;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        sumOfDigits(123,0);
    }

    static void sumOfDigits(int n,int result){
        if(n==0){
            System.out.println(result);
            return;
        }

        int rem = n%10;
        sumOfDigits(n/10,result+rem);
    }

}
