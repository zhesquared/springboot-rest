package ru.netology.springbootrest.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springbootrest.model.Authorities;
import ru.netology.springbootrest.model.User;
import ru.netology.springbootrest.service.AuthorizationService;

import java.util.List;

@Validated
@RestController
public class AuthorizationController {

    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user, BindingResult result) {
        return service.getAuthorities(user);
    }
}