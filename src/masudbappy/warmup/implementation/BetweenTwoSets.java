package masudbappy.warmup.implementation;

import java.util.Scanner;

/*
You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:

        The elements of the first array are all factors of the integer being considered
        The integer being considered is a factor of all elements of the second array
        These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.
*/

public abstract class  BetweenTwoSets {
    static int getTotal(int[] a, int[] b){
        int count = 0, r=0, j=0;
        int[] d = new int[101];
        for (int x=1; x<101; x++){
            int c = 0;
            for (int i = 0; i<a.length; i++){
                if (x% a[i] == 0 && x>= a[i]){
                    c++;
                }
            }
            if (c==a.length){
                d[j]=x;
                r++;
                j++;
            }
        }
        for (j=0; j<r ; j++){
            int c =0;
            for (int i =0; i<b.length; i++){
                if (b[i]%d[j]==0){
                    c++;
                }
                if (c==b.length){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i =0; i<m; i++){
            b[i] = sc.nextInt();
        }

        int total = getTotal(a, b);
        System.out.println(total);
    }
}
