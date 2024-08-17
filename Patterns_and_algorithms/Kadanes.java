package Patterns_and_algorithms;

public class Kadanes {
    public static int kadanes(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i: arr){
            sum+=i;
            max= Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]  arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadanes(arr));
    }
}
