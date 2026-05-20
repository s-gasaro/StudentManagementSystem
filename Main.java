public class Main {
    public static void main(String[] args) {

        Student student1 = new Student ( "Sarah" , 40 , 90.2);
        Student student2 = new Student ( "Gasaro" , 34 , 65);

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        System.out.println(student1.calculateGrade());
        System.out.println(student2.calculateGrade());

        System.out.println(student1.isPassed());
        System.out.println(student2.isPassed());

        Student.schoolMotto();

        System.out.println(student1.compareMarks(student2));

        double bonusMarks = 0.5;

        student1.marks = student1.marks + bonusMarks;
        student2.marks = student2.marks + bonusMarks;

        System.out.println("updated marks:" + student1.marks);
    }
}