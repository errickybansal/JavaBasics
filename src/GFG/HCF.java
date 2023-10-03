package GFG;

public class HCF {
    public static void main(String[] args) {
        int a = 4, b = 2;
        System.out.println(hcf(a,b));
    }

    static int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
