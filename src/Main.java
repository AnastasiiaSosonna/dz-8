import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1= new Student("Vasya", "Lol");
        Student student2=new Student("Jonny", "Feee");

        Group mx= new Group(student1);

        mx.addStudent(student2);
    }
}