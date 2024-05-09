package multiThreading;

public class Employee {
    private int empId;

    private String empName;

    private double salary;

    private double perDayBasicSalary;

    private int numberOfWorkingDays;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPerDayBasicSalary() {
        return perDayBasicSalary;
    }

    public void setPerDayBasicSalary(double perDayBasicSalary) {
        this.perDayBasicSalary = perDayBasicSalary;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public Employee(int empId, String empName, double perDayBasicSalary, int numberOfWorkingDays) {
        this.empId = empId;
        this.empName = empName;
        this.perDayBasicSalary = perDayBasicSalary;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    
}
