package org.example;


public class Fib {
    private static long count;

    public static long getCount() {
        return count;
    }

    public static void clearCount() {
        count = 0;
    }

    public static void incrementCount() {
        count++;
    }

    public static long fib(int n) {
        incrementCount();
        if (n < 0) {
            throw new RuntimeException("invalid n " + n);
        }
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
