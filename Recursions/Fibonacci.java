package Recursions;

public class Fibonacci {
    public static int fibonacci(int a, int b, int c, int n) {
        if (n == 1) {
            return b;
        }
        c = a + b;
        a = b;
        b = c;
        return fibonacci(a, b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1;
        int c = 0;

        int result = fibonacci(a, b, c, n);
        System.out.println(result);
    }
}
