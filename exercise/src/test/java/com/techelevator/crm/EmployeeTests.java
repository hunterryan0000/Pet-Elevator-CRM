package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {

    @Test
    public void test_get_balance_due_employee() {
        Employee employee = new Employee("Reg", "Ryan");

        Map<String,Double> balance = new HashMap<>();
        balance.put("Walking", 26.00);

        Assert.assertEquals(13.00, employee.getBalanceDue(balance), 0.01);
    }
}
