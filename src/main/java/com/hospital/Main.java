package com.hospital;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        BillingService billingService = new BillingService();

        List<Service> services = Arrays.asList(
                new Service("Consultation", 500),
                new Service("Lab Test", 1000)
        );

        double total = billingService.calculateTotal(services);

        System.out.println("Total Bill: " + total);
    }
}