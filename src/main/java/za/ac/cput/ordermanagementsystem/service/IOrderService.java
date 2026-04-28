package za.ac.cput.ordermanagementsystem.service;

import za.ac.cput.ordermanagementsystem.domain.Order;

import java.util.List;

public interface IOrderService {
    Order create(Order order);
    Order read(String id);
    List<Order> getAll();
    Order update(Order order);
    void delete(String id);
}
