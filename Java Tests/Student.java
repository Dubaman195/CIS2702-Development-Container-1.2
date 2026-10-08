public class Student {
    // Attributes
    private String name;
    private int studentId;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int studentId, int age, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.gpa = gpa;
    }

    // Methods
    public void displayInfo() {

    }

    public boolean isHonorStudent() {
        if (gpa >= 3.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canG
}
