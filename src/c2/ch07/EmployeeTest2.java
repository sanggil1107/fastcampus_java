package c2.ch07;

public class EmployeeTest2 {
    
    public static void main(String[] args) {
        System.out.println(Employee.getSerialNum());
        Employee.setSerialNum(1003);
        System.out.println(Employee.getSerialNum());
    }
}
