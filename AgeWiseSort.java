import java.util.Comparator;

public class AgeWiseSort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
