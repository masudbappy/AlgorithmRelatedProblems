package masudbappy.warmup.implementation;

import java.util.Scanner;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apple, int[] orange){
        int appleCount = 0;
        int orangeCount =0;

        for (int i =0; i<apple.length; i++){
            int distance = a + apple[i];

            if (s<=distance && distance<=t){
                appleCount++;
            }
        }
        for (int i =0; i<orange.length; i++){
            int distance = b + orange[i];
            if (s<=distance && distance<=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] apple = new int[m];
        for (int i = 0; i<m; i ++){
            apple[i] = sc.nextInt();
        }

        int[] orange = new int[n];
        for (int j=0; j<n; j++){
            orange[j] = sc.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);

    }
}
