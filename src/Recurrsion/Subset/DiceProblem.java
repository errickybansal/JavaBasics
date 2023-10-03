package Recurrsion.Subset;

public class DiceProblem {

    public static void main(String[] args) {
        dice("",2);
    }

    public static void dice(String output, int input){
        if (input==0){
            System.out.println(output);
            return;
        }
        for(int i=1;i<=input;i++){
            dice(output+i,input-i);
        }
    }
}
