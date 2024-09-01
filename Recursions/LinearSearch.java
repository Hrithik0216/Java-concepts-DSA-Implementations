package Recursions;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static int findTarget(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findTarget(arr, target, index + 1);
    }

    public static List<Integer> findTargetWithArrayList(int[] arr, int target, int index, List<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findTargetWithArrayList(arr, target, index + 1, list);
    }
    public static List<Integer> findTargetWithArrayListInside(int[] arr, int target, int index) {
        List<Integer> resultlist = new ArrayList<>();
        if(index == arr.length) {
            return resultlist;
        }
        if (arr[index] == target) {
            resultlist.add(index);
        }
        List<Integer> recurList= findTargetWithArrayListInside(arr, target,index + 1);
        resultlist.addAll(recurList);
        return resultlist;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5,5,5, 6};
        List<Integer> list = new ArrayList<>();
        System.out.println(findTargetWithArrayListInside(arr, 5, 0));

    }
}
