package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the shipping companies
        ShippingCompany[] shippingCompanies = {new UPS(), new USMail(), new FedEx()};

        // Input package data
        String[] packageDescriptions = {"Book", "Phone", "Boots"};
        double[] weights = new double[3];
        String[] zones = new String[3];

        // Read package data from the input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter weight of " + packageDescriptions[i] + " (in pounds): ");
            weights[i] = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter zone of " + packageDescriptions[i] + ": ");
            zones[i] = scanner.nextLine();
        }

        // Calculate and display cost for each package using the cheapest shipping company
        for (int i = 0; i < packageDescriptions.length; i++) {
            String description = packageDescriptions[i];
            double weight = weights[i];
            String zone = zones[i];
            double minCost = Double.MAX_VALUE;
            String minShippingCompany = "";

            // Calculate cost using each shipping company and find the cheapest
            for (ShippingCompany shippingCompany : shippingCompanies) {
                double cost = shippingCompany.calculateCost(weight, zone);
                if (cost < minCost) {
                    minCost = cost;
                    minShippingCompany = shippingCompany.getName();
                }
            }

            // Print the result
            System.out.println(description + "\t$" + String.format("%.2f", minCost) + "\t" + minShippingCompany);
        }

        scanner.close();
    }
}
