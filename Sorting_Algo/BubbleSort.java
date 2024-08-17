package Sorting_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< n;i++){
            arr[i]= s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i: arr){
            list.add(i);
        }
        System.out.println(list);
    }
}
