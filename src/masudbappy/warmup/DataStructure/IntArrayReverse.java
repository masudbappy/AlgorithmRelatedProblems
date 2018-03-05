package masudbappy.warmup.DataStructure;

import java.util.Scanner;

public class IntArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i =0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        for (int j=array.length-1; j>=0;j--){
            System.out.println(array[j]);
        }

        scanner.close();
    }
}
