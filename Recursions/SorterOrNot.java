package Recursions;

import java.util.Arrays;

public class SorterOrNot {
    public static boolean findSorted (int []arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && findSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,34,4,5};
        System.out.println(findSorted(arr,0));
        System.out.println(Arrays.toString(arr));
    }
}
