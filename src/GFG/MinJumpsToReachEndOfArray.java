package GFG;

public class MinJumpsToReachEndOfArray {
    public static void main(String[] args) {
        int a[] = {2,3,1,1,4};
        int n = a.length;
        int jumps = minJumps(a,n);
        System.out.println(jumps);
    }

    public static int minJumps(int a[],int n)
    {
        if(n==1) return 0;
        if(a[0]==0) return -1;
        int range = a[0];
        int steps = a[0];
        int jumps = 1;
        for(int i =1;i<n;i++){
            if(i==n-1) return jumps;
            range = Math.max(range,i+a[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(range<=i) return -1;
                steps = range-i;

            }
        }
        return -1;
    }
}
