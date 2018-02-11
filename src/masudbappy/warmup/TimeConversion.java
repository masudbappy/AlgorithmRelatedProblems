package masudbappy.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        try {
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new SimpleDateFormat("hh:mm:ssa").parse(time)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
