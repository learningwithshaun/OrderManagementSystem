package za.ac.cput.ordermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.ordermanagementsystem.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
