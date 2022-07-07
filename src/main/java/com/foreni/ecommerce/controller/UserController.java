package com.foreni.ecommerce.controller;

import com.foreni.ecommerce.dto.ResponseDto;
import com.foreni.ecommerce.dto.user.SignInDto;
import com.foreni.ecommerce.dto.user.SignInReponseDto;
import com.foreni.ecommerce.dto.user.SignupDto;
import com.foreni.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@author : shadman sakib khan

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }


}
