import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student groupLeader;
    private List<Student> students;
    private List<String> tasks;

    Group(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void changeGroupLeader(Student newLeader) {
        this.groupLeader = newLeader;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTask(String newTask) {
        tasks.add(newTask);
    }

    public List<Student> getStudents() {
        return students;
    }

}
