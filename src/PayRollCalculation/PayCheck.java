package PayRollCalculation;

public final class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    private DateRange payPeriod;
    private DateRange dateRange;
    private Employee employee;

    public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,DateRange payPeriod) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        //this.dateRange = dateRange;
        this.payPeriod = payPeriod;
        //this.employee = employee;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getNetPay(){
        //netPay
        double totalDeductions = fica + state + local + medicare + socialSecurity;
        return grossPay - totalDeductions;
    }

    public void print(){
        System.out.println("Pay Period: " + payPeriod);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("FICA: $" + fica);
        System.out.println("State Tax: $" + state);
        System.out.println("Local Tax: $" + local);
        System.out.println("Medicare: $" + medicare);
        System.out.println("Social Security: $" + socialSecurity);
        System.out.println("Net Pay: $" + getNetPay());
    }
}
