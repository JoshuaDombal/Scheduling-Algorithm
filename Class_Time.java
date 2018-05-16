

import java.util.*;


public class Class_Time implements Comparable<Class_Time>{

    private double x;
    private double y;


    public Class_Time() {
    }

    public Class_Time(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
         return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public int compareTo(Class_Time u) {
        if (this.y == u.y) {
            return 0;
        } else if (this.y > u.y) {
            return 1;
        } else {
            return -1;
        }
    }

    public void dis() {
        System.out.println(x + ", " + y);
    }



    /*Collections.sort(class_times, new Comparator<Class_Time>() {
        public double compare(Class_Time ct1, Class_Time ct2) {
            return Double.compare(ct1.getX(), ct2.getX());
        }
    });
*/

}
