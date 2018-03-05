package masudbappy.warmup.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCocolate {
    public static int solution(int input, int[] numberArray, int day, int month){
        /*int sum, count=0,j,k;
        for (int i=0;i<=day;i++){
            k=i;
            sum = 0;
            j =1;
            while(j<=month){
                sum = sum+numberArray[k];
                k++;
                j++;
            }
            if (sum==day){
                count++;
            }
        }
        return count;*/
        int total = 0;
        for (int i =0; i<input-month; i++){
            if (Arrays.stream(numberArray,i, i+month).sum()==day){
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        if (input>100)
            return;

        int[] numberArray = new int[input];
        for (int i =0; i<input; i++){
            numberArray[i] = sc.nextInt();
        }
        int day = sc.nextInt();
        int month = sc.nextInt();
        int result = solution(input,numberArray,day,month);
        System.out.println(result);
    }


}
