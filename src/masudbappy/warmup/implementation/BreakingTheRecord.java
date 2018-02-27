package masudbappy.warmup.implementation;

import java.util.Scanner;

public class BreakingTheRecord {
    static int[] breakingRecords(int[] s){
        int highest, lowest;
        highest = lowest = s[0];

        int[] result = new int[2];

        for (int s_i = 1; s_i < s.length; s_i++)
        {
            if (s[s_i] > highest)
            {
                highest = s[s_i];
                ++result[0];
            }
            else if (s[s_i] < lowest)
            {
                lowest = s[s_i];
                ++result[1];
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i = 0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = breakingRecords(s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
