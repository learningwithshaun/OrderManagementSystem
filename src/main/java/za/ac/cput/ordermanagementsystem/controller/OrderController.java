package za.ac.cput.ordermanagementsystem.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.ordermanagementsystem.domain.Order;
import za.ac.cput.ordermanagementsystem.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) { //Generated constructor with parameter you don't need to worry about this
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.create(order);
    }

    @GetMapping("/{id}")
    public Order read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping
    public List<Order> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Order update(@RequestBody Order order) {
        return service.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
