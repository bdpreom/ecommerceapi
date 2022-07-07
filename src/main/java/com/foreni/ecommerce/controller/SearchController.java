package com.foreni.ecommerce.controller;

import com.foreni.ecommerce.model.Product;
import com.foreni.ecommerce.model.User;
import com.foreni.ecommerce.repository.ProductRepository;
import com.foreni.ecommerce.repository.SearchRepository;
import com.foreni.ecommerce.repository.UserRepository;
import com.foreni.ecommerce.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private SearchRepository searchRepository;


    @GetMapping("/search/{query}")
    public ResponseEntity<?> search(@RequestParam("token") String token,@PathVariable("query") String query){
        //principal currently logged in
        //search paremeter
        System.out.println(query);
        authenticationService.authenticate(token);
        User user = authenticationService.getUser(token);


        //List<Product> products =  this.productRepository.findByNameContainingAndUser(query,user);
        List<Product> products = searchRepository.searchProducts(query,user);

        return  ResponseEntity.ok(products);

    }











    
}
