package GreetingCard;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date orderDate;
    List<CardPackage> cardPackages;
    private double basePrice;

    public Order(Date orderDate,  double basePrice) {
        this.orderDate = orderDate;
        this.basePrice = basePrice;
        cardPackages = new ArrayList<>();
    }

    public double getTotalPrice(Customer customer) {
        // Calculate seasonal discounts
        double seasonalDiscount = 0;
        for (CardPackage cardPackage : cardPackages) {
            if (cardPackage instanceof HolidayCard) {
                HolidayCard holidayPackage = (HolidayCard) cardPackage;
                if (holidayPackage.isSeasonalDiscount()) {
                    seasonalDiscount += holidayPackage.getSeasonalDiscountAmount();
                }
            }
        }

        // Calculate customer discount
        double customerDiscount = customer.isSubscribed() ? basePrice * 0.1 : 0; // 10% discount for subscribed clients

        // Calculate total price after discounts
        double totalPrice = basePrice - seasonalDiscount - customerDiscount;

        return totalPrice;
    }

    public void printReceipt(Customer customer) {
        System.out.println("Receipt:");
        System.out.println("Date: " + orderDate);

        // Display card package names and base prices
        System.out.println("Card Packages:");
        for (CardPackage cardPackage : cardPackages) {
            System.out.println("- " + cardPackage.getName());
        }

        // Calculate and display seasonal discounts
        double seasonalDiscount = 0;
        for (CardPackage cardPackage : cardPackages) {
            if (cardPackage instanceof HolidayCard) {
                HolidayCard holidayPackage = (HolidayCard) cardPackage;
                if (holidayPackage.isSeasonalDiscount()) {
                    seasonalDiscount += holidayPackage.getSeasonalDiscountAmount();
                }
            }
        }
        if (seasonalDiscount > 0) {
            System.out.println("Seasonal Discount: $" + seasonalDiscount);
        }

        // Calculate and display customer discount
        double customerDiscount = customer.isSubscribed() ? basePrice * 0.1 : 0; // 10% discount for subscribed clients
        if (customerDiscount > 0) {
            System.out.println("Customer Discount: $" + customerDiscount);
        }

        // Calculate total price after discounts
        double totalPrice = basePrice - seasonalDiscount - customerDiscount;
        System.out.println("Total Price: $" + totalPrice);
    }
}
