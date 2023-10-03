package Recurrsion.SelfPractice;

public class PrintN {

    public static void main(String[] args) {
        printN(5);
    }

    public static void printN(int n){

        if(n==0) return;


        printN(n-1);
        System.out.println(n);
    }
}
