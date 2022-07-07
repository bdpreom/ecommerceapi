package com.foreni.ecommerce.repository;

import com.foreni.ecommerce.model.AuthenticationToken;
import com.foreni.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@author : shadman sakib khan

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}
