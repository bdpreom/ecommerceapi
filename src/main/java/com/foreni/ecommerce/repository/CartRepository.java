package com.foreni.ecommerce.repository;

import com.foreni.ecommerce.model.Cart;
import com.foreni.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@author : shadman sakib khan

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
