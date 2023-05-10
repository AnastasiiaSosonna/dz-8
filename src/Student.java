public class Student {
    private static int lastId = 0;
    private int id;
    private String firstName;
    private String lastName;

    Student(String firstName, String lastName) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

