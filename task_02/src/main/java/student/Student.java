package student;

//Modify the code below
public class Student {
    private String studentId;
    private String name;
    private int grade;
    private boolean isPassing;

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        if (grade >= 0 && grade <= 100) {
            if (grade >= 50) {
                this.isPassing = true;
            } else {
                this.isPassing = false;
            }
        } else {
            System.out.println("Grade is invalid.");
            this.isPassing = false;
        }
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassing() {
        return isPassing;
    }

    public void setGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
            if (grade >= 0 && grade <= 100) {
                if (grade >= 50) {
                    this.isPassing = true;
                } else {
                    this.isPassing = false;
                }
            }
        } else {
            System.out.println("New grade is invalid.");
        }
    }

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(isPassing);
    }

    public static void main(String[] args) {

    }
}
