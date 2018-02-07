package masudbappy;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxOfAnArray {
//Given five positive integers, find the minimum and maximum values
// that can be calculated by summing exactly four of the five integers.
// Then print the respective minimum and maximum values as a single line
// of two space-separated long integers.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        long[] arr = new long[5];

        long sum=0;
        long max =0 ;
        long min = 0;

        arr[0] = sum = min = max = sc.nextLong();

        for (int i =1; i<5; i++){

            arr[i] = sc.nextLong();

          if (max>arr[i])
              max = arr[i];
          if (min<arr[i])
              max = arr[i];
          sum += arr[i];
        }

        System.out.println( (sum - max) + " " + (sum - min));

        sc.close();
    }
}
