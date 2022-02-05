package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    @Test
    public void test_get_balance_due() {
        Customer customer = new Customer("Ryan", "Reg");

        Map<String,Double> balance = new HashMap<>();
        balance.put("Grooming", 24.99);

        Assert.assertEquals(24.99, customer.getBalanceDue(balance), 0.01);
    }
}
