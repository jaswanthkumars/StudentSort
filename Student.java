import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Student {
    String studentName;
    int studentId;
    int marks;
    int age;

    Student(String studentName, int studentId, int marks, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student student=(Student) o;
        return this.studentId==((Student) o).studentId;
        }

    @Override
    public int hashCode() {
        return studentId;
    }
}
