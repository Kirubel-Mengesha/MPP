package Lab3;

public class FedEx implements ShippingCompany{
    @Override
    public double calculateCost(double weight, String zone) {
        double zoneMultiplier;
        switch (zone) {
            case "IA":
            case "MT":
            case "OR":
            case "CA":
                zoneMultiplier = 0.35;
                break;
            case "TX":
            case "UT":
                zoneMultiplier = 0.30;
                break;
            case "FL":
            case "MA":
            case "OH":
                zoneMultiplier = 0.55;
                break;
            default:
                zoneMultiplier = 0.43;
        }
        return zoneMultiplier * weight;
    }

    @Override
    public String getName() {
        return "FedEx";
    }
}
