package masudbappy;

import java.util.Scanner;

public class BirthdayCakeCandales {

    static int birthDayCake(int n, int arr[]){
        int max = arr[0];
        int num =1;
        for (int i =1; i<n; i++){
            if (arr[i]>max){
                max = arr[i];
                num = 1;
            }
            else if (arr[i] == max){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int result = birthDayCake(n, arr);
        System.out.println(result);
    }
}
