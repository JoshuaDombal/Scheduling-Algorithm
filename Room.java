
import java.util.*;


public class Room {


    private List<Class_Time> sections;


    public Room() {
        this.sections = new LinkedList<Class_Time>();
    }

    public void addSection(Class_Time ct) {
        sections.add(ct);
    }

    public List<Class_Time> getSections() {
        return sections;
    }
}
