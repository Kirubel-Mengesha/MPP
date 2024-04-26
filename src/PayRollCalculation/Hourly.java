package PayRollCalculation;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calGrossPay(DateRange dateRange) {
        return hourlyWage * hoursPerWeek * 4;
    }

    @Override
    public PayCheck calcCompensation(int month, int year) {
        return super.calcCompensation(month, year);
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hourlyWage=" + hourlyWage +
                ", hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}
