public class Student {

    String studentName;
    int age;
    double marks;

    public Student(String studentName, int age, double marks) {
        this.studentName = studentName;
        this.age = age;
        this.marks = marks;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }

    }

    public boolean isPassed() {
        if (marks >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public static void schoolMotto(){
        System.out.println("School Motto: Education For Everyone");

    }

    public String compareMarks(Student otherStudent) {
        if (marks >= otherStudent.marks) {
            return studentName;
        } else {
            return otherStudent.studentName;
        }
    }
}

