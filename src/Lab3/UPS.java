package Lab3;

public class UPS implements ShippingCompany{
    @Override
    public double calculateCost(double weight, String zone) {
        return 0.45 * weight;
    }

    @Override
    public String getName() {
        return "UPS";
    }
}
