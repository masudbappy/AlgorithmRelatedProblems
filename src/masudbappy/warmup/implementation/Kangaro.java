package masudbappy.warmup.implementation;

import java.util.Scanner;

public class Kangaro {

    static String kangaroo(int x1, int x2, int v1, int v2){
        if(v1<=v2){
            return "NO";
        }else {
            if((x2-x1)%(v1-v2)==0){
                return "YES";
            }else {
                return "NO";
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        String result = kangaroo(x1,x2,v1,v2);
        System.out.println(result);
    }
}
