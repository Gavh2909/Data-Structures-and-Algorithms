package multiThreading;

public class SalaryCalculation implements Runnable {

    private Employee e = null;

    SalaryCalculation(Employee e) {
        this.e = e;
    }

    @Override
    public void run() { // we will always have to implement this method because run is abstract method
                        // in Runnable interface

    }

    void SalaryCalculation() {
       double salary = e.getPerDayBasicSalary() * e.getNumberOfWorkingDays();
       e.setSalary(salary);
    }

}
