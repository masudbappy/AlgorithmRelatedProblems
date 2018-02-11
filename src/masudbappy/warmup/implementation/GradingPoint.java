package masudbappy.warmup.implementation;

import java.util.Scanner;

public class GradingPoint {
    public static int[] solve(int[] grades){

        int[] res = new int[grades.length];
        for(int i = 0; i<grades.length; i++){
            if(grades[i]%5>2 &&  !(grades[i]<38)){
                res[i] = grades[i] + (5-grades[i]%5);
            }else{
                res[i] = grades[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

    }
}
