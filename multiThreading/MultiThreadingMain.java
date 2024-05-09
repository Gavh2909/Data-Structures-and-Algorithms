package multiThreading;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import multiThreading.Employee;

public class MultiThreadingMain {
    public static void main(String[] args) {
        
        // SELECT * FROM employee;
        // salary = perDayBasicSalary * numberOfWorkingDays;
        Employee e1 = new Employee(123, "KArthik", 1000,24);
        Employee e2 = new Employee(124, "Ganesh", 900,26);
        Employee e3 = new Employee(125, "Satish", 5000,24);
        Employee e4 = new Employee(126, "Piyush", 9000,23);
        Employee e5 = new Employee(127, "Rushi", 6500,31);
        Employee e6 = new Employee(128, "Anil", 1760,30);
        Employee e7 = new Employee(129, "AAkash", 2000,14);
        Employee e8 = new Employee(112, "Mulesh", 1900,28);

        List<Employee> empList = new ArrayList<>();
        empList.add(e8);
        empList.add(e7);
        empList.add(e6);
        empList.add(e5);
        empList.add(e4);
        empList.add(e3);
        empList.add(e2);
        empList.add(e1);
        
      ExecutorService service =  Executors.newFixedThreadPool(3);
        for(int i=0;i<empList.size();i++){
            SalaryCalculation s = new SalaryCalculation(empList.get(i));
            service.submit(s);
        }

        service.shutdown();
    }
}
