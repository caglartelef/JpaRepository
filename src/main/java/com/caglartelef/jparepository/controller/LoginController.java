package com.caglartelef.jparepository.controller;

import com.caglartelef.jparepository.repository.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    RepositoryService repositoryService;

    @GetMapping
    public boolean login(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
        return repositoryService.getUser(email, password);
    }
}
