package com.foreni.ecommerce.repository;


import com.foreni.ecommerce.model.Product;
import com.foreni.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SearchRepository  extends JpaRepository<Product, Integer> {

    @Query("select p from  Product p WHERE "+
              "p.name LIKE CONCAT('%',:query, '%')" +
               "Or p.description LIKE CONCAT('%',:query, '%')" +
                    " Or p.price LIKE CONCAT('%',:query, '%')"
                    )
    List<Product> searchProducts(String query, User user);


    @Query(value = "select p from  product p WHERE "+
            "p.name LIKE CONCAT('%',:query, '%')" +
            "or p.description LIKE CONCAT('%',:query, '%')" +
            "or p.price LIKE CONCAT('%',:query, '%')",nativeQuery = true)

    List<Product> searchProductsSql(String query,User user);



}
