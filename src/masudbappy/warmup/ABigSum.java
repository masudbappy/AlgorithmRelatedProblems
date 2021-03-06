package masudbappy.warmup;

import java.util.Scanner;
/*
You are given an array of integers of size . You need to print the sum of the elements in the array,
 keeping in mind that some of those integers may be quite large.
  Input Format:-
       The first line of the input consists of an integer .
       The next line contains  space-separated integers contained in the array.*/

public class ABigSum {

    static long aVeryBigSum(int n, long[] ar) {
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += ar[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
