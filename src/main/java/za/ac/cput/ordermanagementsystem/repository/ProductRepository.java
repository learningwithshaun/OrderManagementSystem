package za.ac.cput.ordermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.ordermanagementsystem.domain.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
