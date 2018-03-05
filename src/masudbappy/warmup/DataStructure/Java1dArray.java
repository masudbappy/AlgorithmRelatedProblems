package masudbappy.warmup.DataStructure;

import java.util.Scanner;

public class Java1dArray {
    public static boolean canWin(int leap, int[] game) {


        for(int i=0, j=0;j<game.length &&i<game.length;j++){
            if(i+leap>=game.length){
                return true;
            }else if(game[i+leap]==0){
                i=i+leap;
                if(i<game.length-1 &&i+leap<game.length ){
                    while(game[i]==0 &&i>0 ){
                        i--;
                    }
                    i++;

                }

            }else if(i+1<game.length&&game[i+1]==0){
                i=i+1;

            }else if(i+1<game.length&&game[i+1]==1){
                return false;
            }else{
                return false;
            }



        }return false;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-->0){
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            int[] game = new int[n];
            for (int i =0; i<n; i++){
                game[i] = scanner.nextInt();
            }
            System.out.println((canWin(leap,game)) ? "YES" : "NO");
        }
    }
}
