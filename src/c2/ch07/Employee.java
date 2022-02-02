package c2.ch07;

public class Employee {
    
    private static int serialNum = 1000;

    private int employeeId;
    private String employName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employName;
    }

    public void setEmployeeName(String employeeName) {
        this.employName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
        // static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다
        // employeeName = "Yang";
    }
}
