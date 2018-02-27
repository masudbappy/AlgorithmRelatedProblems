package masudbappy.warmup.lamdaExpression;

import java.io.File;
import java.io.FileFilter;

public class FirstLamda {
    public static void main(String[] args) {
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".txt");
//            }
//        };

        FileFilter fileFilter = (File pathname)-> pathname.getName().endsWith(".txt");

        try {
            File file = new File("C:/user/bappy/desktop");

            File[] files = file.listFiles(fileFilter);

            for (File f: files) {
                System.out.println(f);

            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
