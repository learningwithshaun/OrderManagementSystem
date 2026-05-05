package za.ac.cput.ordermanagementsystem.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.ordermanagementsystem.domain.Customer;
import za.ac.cput.ordermanagementsystem.domain.Name;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerFactoryTest {
    @Test
    void shouldCreateAValidCustomer(){
        Name name = new Name.Builder()
                .setFirstName("Amanda")
                .setMiddleName("Shaun")
                .setLasttName("Msutu")
                .build();
        Customer customer;
        customer = CustomerFactory.createCustomer("CUST001", name, "amandamsutu02@gmail.com", "0614842617");
        assertNotNull(customer);
        assertNotNull(name);
        assertEquals("CUST001", customer.getCustomerId());
        assertEquals(name, customer.getName());
        assertEquals("amandamsutu02@gmail.com", customer.getEmail());
        assertEquals("0614842617", customer.getMobileNumber());
    }
}
