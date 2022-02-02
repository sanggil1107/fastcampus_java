package c2.ch06;

public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee yang = new Employee();
        yang.setEmployeeName("양");

        Employee sang = new Employee();
        sang.setEmployeeName("상길");

        System.out.println(yang.getEmployeeName() + ", " + yang.getEmployeeId() + ", " + Employee.serialNum);
        System.out.println(sang.getEmployeeName() + ", " + sang.getEmployeeId() + ", " + Employee.serialNum);
    }
}
