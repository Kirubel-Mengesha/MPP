package PayRollCalculation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Employee {
    private String empId;
    List<PayCheck>payCheckList;

    public Employee(String empId) {
        this.empId = empId;
        payCheckList = new ArrayList<>();
    }


    public abstract double calGrossPay(DateRange dateRange);

    public void addPaycheck(PayCheck payCheck){
        payCheckList.add(payCheck);
    }
    public PayCheck calcCompensation(int month,int year){
        Calendar startDate = Calendar.getInstance();
        startDate.set(year, month - 1, 1); // month is 0-based in Calendar
        Calendar endDate = Calendar.getInstance();
        endDate.set(year, month - 1, DateRange.getLastDayOfMonth(startDate.getTime()));
        DateRange dateRange = new DateRange(startDate, endDate);
        double grossPay = calGrossPay(dateRange);
        double fica = grossPay * 0.23;
        double stateTax = grossPay * 0.05;
        double localTax = grossPay * 0.01;
        double medicare = grossPay * 0.03;
        double socialSecurity = grossPay * 0.075;

        // Create Paycheck object
        PayCheck paycheck = new PayCheck(grossPay, fica, stateTax, localTax, medicare, socialSecurity,dateRange);
        payCheckList.add(paycheck); // Add to list
        return paycheck;
    }

    public void print(){
        System.out.println("Employee{" +
                "empId='" + empId + '\'' +
                '}');
        for (PayCheck p: payCheckList){
            p.print();
        }
    }

}
