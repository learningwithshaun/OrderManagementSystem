package za.ac.cput.ordermanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import za.ac.cput.ordermanagementsystem.domain.Order;
import za.ac.cput.ordermanagementsystem.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService implements IOrderService{

    @Autowired
    private OrderRepository repository;

    @Override
    public Order create(Order order) {
        if(order == null){
            return null;
        }
        return repository.save(order);
    }

    @Override
    public Order read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order update(Order order) {
        if(order == null){
            return null;
        }
        return repository.save(order);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
