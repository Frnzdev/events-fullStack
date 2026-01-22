package com.full_events.eventos_api.controllers;

import com.full_events.eventos_api.domain.user.User;
import com.full_events.eventos_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
       List<User> users = userRepository.findAll();
        return users;
    }

}
