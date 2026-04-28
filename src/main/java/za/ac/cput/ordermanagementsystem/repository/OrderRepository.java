package za.ac.cput.ordermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.ordermanagementsystem.domain.Order;

public interface OrderRepository extends JpaRepository<Order,String> {
}
