package za.ac.cput.ordermanagementsystem.service;

import za.ac.cput.ordermanagementsystem.domain.Customer;

import java.util.List;

public interface ICustomerService {
    Customer create(Customer customer);
    Customer read(String id);
    List<Customer> getAll();
    Customer update(Customer customer);
    void delete(String id);
}
