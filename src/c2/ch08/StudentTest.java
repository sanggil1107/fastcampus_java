package c2.ch08;

public class StudentTest {
    
    public static void main(String[] args) {

        Student yang = new Student(1001, "양");

        yang.addSubject("국어", 100);
        yang.addSubject("수학", 50);

        Student choi = new Student(1002, "최");

        choi.addSubject("국어", 70);
        choi.addSubject("수학", 85);
        choi.addSubject("영어", 100);

        yang.showStudentInfo();
        System.out.println("======================================");
        choi.showStudentInfo();
    }
}
