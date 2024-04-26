package GreetingCard;

public class HolidayCard extends CardPackage{
    private boolean seasonalDiscount;
    private double seasonalDiscountAmount;

    public HolidayCard(String name, boolean isDiscounted, boolean seasonalDiscount, double seasonalDiscountAmount) {
        super(name, isDiscounted);
        this.seasonalDiscount = seasonalDiscount;
        this.seasonalDiscountAmount = seasonalDiscountAmount;
    }

    public boolean isSeasonalDiscount() {
        return seasonalDiscount;
    }

    public double getSeasonalDiscountAmount() {
        return seasonalDiscountAmount;
    }
}
