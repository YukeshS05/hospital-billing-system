package com.hospital;

import java.util.List;

public class BillingService {

    // Method to calculate total bill
    public double calculateTotal(List<Service> services) {
        double total = 0;

        for (Service s : services) {

            // Validation (VERY IMPORTANT)
            if (s.getCost() < 0) {
                throw new IllegalArgumentException("Invalid service cost");
            }

            total += s.getCost();
        }

        return total;
    }
}