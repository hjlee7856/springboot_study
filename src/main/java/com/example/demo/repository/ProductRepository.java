package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository <Product, Long>{
    Optional<Product> findById(Long id);
}
