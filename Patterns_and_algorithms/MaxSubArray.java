package Patterns_and_algorithms;

public class MaxSubArray {
    public static int maxSubArraySum(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Calculate the sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        // Slide the window and update max
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 9, 31, -4, 21, 7};
        int result = maxSubArraySum(arr, 3);
        System.out.println("Maximum subarray sum: " + result);
    }
}