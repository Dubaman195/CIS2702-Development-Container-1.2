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

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.age = 18;
        this.gpa = 0.0;
    }

    // Methods
    public void displayInfo() {
        System.out.println(name + ":");
        System.out.println("ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public boolean isHonorStudent() {
        if (gpa >= 3.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGraduate() {
        if (gpa >= 2.0) {
            return true;
        } else {
            return false;
        }
    }

    public void updateGPA(double newGPA){
        gpa = newGPA;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 2299832, 29, 3.2);
        Student student2 = new Student("Jess", 2299833, 23, 3.5);
        Student student3 = new Student("Alex", 2299834, 19, 1.9);

        // Student 1 Methods
        // student1.displayInfo();

        // if (student1.isHonorStudent()) {
        //     System.out.println(student1.name + " is an honour student.");
        // } else {
        //     System.out.println(student1.name + " is not an honour student.");
        // }

        // if (student1.canGraduate()) {
        //     System.out.println(student1.name + " can graduate");
        // } else {
        //     System.out.println(student1.name + " cannot graduate.");
        // }

        // Student 2 Methods
        // student2.displayInfo();

        // if (student2.isHonorStudent()) {
        //     System.out.println(student2.name + " is an honour student.");
        // } else {
        //     System.out.println(student2.name + " is not an honour student.");
        // }

        // if (student2.canGraduate()) {
        //     System.out.println(student2.name + " can graduate");
        // } else {
        //     System.out.println(student2.name + " cannot graduate.");
        // }

        // Student 3 Methods
        // student3.displayInfo();

        // if (student3.isHonorStudent()) {
        //     System.out.println(student3.name + " is an honour student.");
        // } else {
        //     System.out.println(student3.name + " is not an honour student.");
        // }

        // if (student3.canGraduate()) {
        //     System.out.println(student3.name + " can graduate");
        // } else {
        //     System.out.println(student3.name + " cannot graduate.");
        // }

    }

}
