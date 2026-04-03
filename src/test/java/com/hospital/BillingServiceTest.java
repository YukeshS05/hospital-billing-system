package com.hospital;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BillingServiceTest {

    BillingService billingService = new BillingService();

    @Test
    public void testTotalCalculation() {
        List<Service> services = Arrays.asList(
                new Service("Consultation", 500),
                new Service("Lab Test", 1000)
        );

        double total = billingService.calculateTotal(services);

        assertEquals(1500, total);
    }

    @Test
    public void testInvalidCost() {
        List<Service> services = Arrays.asList(
                new Service("Invalid", -500)
        );

        assertThrows(IllegalArgumentException.class, () -> {
            billingService.calculateTotal(services);
        });
    }
}