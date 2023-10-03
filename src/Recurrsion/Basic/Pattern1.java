package Recurrsion.Basic;

public class Pattern1 {

    public static void main(String[] args) {
       pat(4,0);
    }

    static void pat(int i,int j){
        if(i==0) return;

        if(j<i) {
            System.out.print("*");
            pat(i,j+1);
        }
        else {
            System.out.println();
            pat(i-1,0);
        }
    }
}
