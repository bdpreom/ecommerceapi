package com.foreni.ecommerce.repository;

import com.foreni.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//@author : shadman sakib khan

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
