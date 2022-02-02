package c2.ch06;

public class Employee {
    
    public static int serialNum = 1000;

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
}
