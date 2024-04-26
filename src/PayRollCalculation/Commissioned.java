package PayRollCalculation;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double commision;
    private double baseSalary;
    List<Order> orderList;

    public Commissioned(String empId, double commision, double baseSalary) {
        super(empId);
        this.commision = commision;
        this.baseSalary = baseSalary;
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order){
        orderList.add(order);
    }


    @Override
    public double calGrossPay(DateRange dateRange) {
        double totalSales = 0.0;
        for (Order o: orderList){
            totalSales += o.getOrderAmount();
        }
        return baseSalary + (totalSales * commision);
    }

    @Override
    public PayCheck calcCompensation(int month, int year) {
        return super.calcCompensation(month, year);
    }

    @Override
    public String toString() {
        return "Commissioned{" +
                "commision=" + commision +
                ", baseSalary=" + baseSalary +
                ", orderList=" + orderList +
                '}';
    }
}
