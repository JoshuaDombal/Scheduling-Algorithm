


import java.util.*;
import java.io.*;

public class Assignment2 {


    public static void main(String[] args) throws Exception {
        File file = new File("times.txt");
        Scanner scanner = new Scanner(file);

        LinkedList<Class_Time> class_times = new LinkedList<Class_Time>();

        while (scanner.hasNext()) {
            String class_t = scanner.next();

            String[] class_ti = class_t.split(",");
            double d1 = Double.parseDouble(class_ti[0].substring(1,class_ti[0].length()));
            double d2 = Double.parseDouble(class_ti[1].substring(0,class_ti[1].length()-1));

            Class_Time c = new Class_Time(d1,d2);

            class_times.add(c);
        }

        Collections.sort(class_times);

/*
        // Prints out the sorted section times
        for (Class_Time ct : class_times) {
            System.out.println(ct.getX() + " ," + ct.getY());
        }
*/

        // Loops through the list of times
        // Adds section times to a class room based on compatability
        // Loops until all sections have been added to a classroom

        LinkedList<Class_Time> remaining_sections = class_times;
        LinkedList<Room> class_rooms = new LinkedList<Room>();

        System.out.println("length of sections"  + remaining_sections.size());

        while (remaining_sections.size() > 0) {
            Room r = new Room();
            Class_Time prev_section = remaining_sections.removeFirst();
            r.addSection(prev_section);
            int len = remaining_sections.size();
            for (int i = 1; i < len-1; i++) {
                if (remaining_sections.get(i).getX() >= prev_section.getY()) {
                    Class_Time curr_section = remaining_sections.get(i);
                    r.addSection(curr_section);
                    prev_section = curr_section;
                    remaining_sections.remove(i);
                }
            }
            class_rooms.add(r);
        }


        // Prints out the Class Rooms with the sections that can be taught
        int count = 1;
        for (Room rr : class_rooms) {
            List<Class_Time> cts  = rr.getSections();
            System.out.println("Class " + count);
            for (Class_Time ctt : cts) {
                ctt.dis();
            }
            count++;
        }

    }
}
