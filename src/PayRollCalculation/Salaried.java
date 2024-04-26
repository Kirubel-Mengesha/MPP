package PayRollCalculation;

public class Salaried extends Employee{
    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calGrossPay(DateRange dateRange) {
        return salary;
    }

    @Override
    public PayCheck calcCompensation(int month, int year) {
        return super.calcCompensation(month, year);
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                '}';
    }
}
