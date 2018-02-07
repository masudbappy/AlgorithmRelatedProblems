package masudbappy;

import java.util.Scanner;

//find the diagonal difference

public class DiagonalDifference {

    static int diagonalDifference(int[][] a){

        int l_diag =0;
        for (int i = 0; i<a.length ; i++){
            l_diag += a[i][i];
        }

        int r_diag = 0;
        for (int j =0; j<a.length; j++){
            r_diag += a[j][a.length-1 -j];
        }

        return Math.abs(l_diag-r_diag);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
