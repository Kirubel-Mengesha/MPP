package PayRollCalculation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Hourly("E001", 20.0, 40));
        employees.add(new Salaried("E002", 3000.0));
        employees.add(new Commissioned("E003",0.07 , 1000));

        Commissioned commissionedEmployee = (Commissioned) employees.get(2);
        commissionedEmployee.addOrder(new Order(1, new Date(), 500.0));
        commissionedEmployee.addOrder(new Order(2, new Date(), 700.0));
        commissionedEmployee.addOrder(new Order(3, new Date(), 600.0));
        commissionedEmployee.addOrder(new Order(4, new Date(), 800.0));

        // Example date range
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.set(Calendar.DAY_OF_MONTH, 1); // Start of the current month
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(Calendar.DAY_OF_MONTH, endCalendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // End of the current month

        DateRange dateRange = new DateRange(startCalendar, endCalendar);

        // Calculate and print paychecks for each employee
        for (Employee employee : employees) {
            PayCheck paycheck = employee.calcCompensation(4,2024); // Pass date range
            System.out.println(employee);
            paycheck.print();
            System.out.println();
        }
    }
}
