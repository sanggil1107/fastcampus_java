package c2.ch02;

public class StudentTest {
    public static void main(String[] args) {
        Student yang = new Student(100, "Yang");
        yang.setKoreaSubject("국어", 100);
        yang.setMathSubject("수학", 95);

        Student choi = new Student(101, "Choi");
        choi.setKoreaSubject("국어", 80);
        choi.setMathSubject("수학", 99);

        yang.showStudentScore();
        choi.showStudentScore();
    }
}
