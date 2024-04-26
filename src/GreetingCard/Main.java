package GreetingCard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", 30, true,true);

        // Create some card packages
        ThankYouCard thankYouCard = new ThankYouCard("Thank You Card", true);
        BirthdayCard birthdayCard = new BirthdayCard("Birthday Card", true);
        ChristmasCard christmasCard = new ChristmasCard("Christmas Card", true, true, 5.0);
        FathersDayCard fathersDayCard = new FathersDayCard("Father's Day Card", true, false, 0.0);
        MothersDayCard mothersDayCard = new MothersDayCard("Mother's Day Card", true, false, 0.0);

        // Add card packages to an order
        List<CardPackage> cardPackages = new ArrayList<>();
        cardPackages.add(thankYouCard);
        cardPackages.add(birthdayCard);
        cardPackages.add(christmasCard);
        cardPackages.add(fathersDayCard);
        cardPackages.add(mothersDayCard);

        // Create an order
        Date orderDate = new Date();
        double basePrice = 50.0; // Assuming base price of $50
        Order order = new Order(orderDate, basePrice);

        // Add card packages to the order
        for (CardPackage cardPackage : cardPackages) {
            order.cardPackages.add(cardPackage);
        }

        // Add the order to the customer
        customer.addOrder(order);

        // Print the receipt for the order
        order.printReceipt(customer);
    }
}
