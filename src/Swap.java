package src;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int temp = a;
        a = b;
        b = temp;


        fun(2, 3, 5, 5, 5);
        fun("damilola");

        System.out.println(a + " This is A");
        System.out.println(b + " This is B");

        armStrong(153);

    }

    static void armStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        System.out.println(original);
        if (sum == original) {
            System.out.println("Armstrinong");
        }

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
