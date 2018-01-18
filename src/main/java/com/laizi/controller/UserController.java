package com.laizi.controller;

import com.laizi.dao.UserRepository;
import com.laizi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by denghaowei on 2018/1/18.
 */
@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = this.userRepository.findOne(id);
        return user;
    }



}
