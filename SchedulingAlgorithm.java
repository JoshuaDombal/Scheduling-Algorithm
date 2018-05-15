


import java.util.*;
import java.io.*;

public class Assignment2 {


    public static void main(String[] args) throws Exception {
        File file = new File("times.txt");
        Scanner scanner = new Scanner(file);

        List<double[]> class_times = new ArrayList<double[]>();

        while (scanner.hasNext()) {
            String class_t = scanner.next();


            String[] class_ti = class_t.split(",");
            double d1 = Double.parseDouble(class_ti[0].substring(1,class_ti[0].length()));
            double d2 = Double.parseDouble(class_ti[1].substring(0,class_ti[1].length()-1));
            double[] pair = {d1, d2};

            System.out.print(d1);
            System.out.print(d2);
            System.out.println();

            class_times.add(pair);

        }

        //for (String[] s : class_times) {
        //    System.out.println(s);
            //System.out.println(s[0]);
            //System.out.println(s[1]);

            //System.out.print(s.charAt(1));
            //System.out.println(s.charAt(3));
        //}


    }
}
