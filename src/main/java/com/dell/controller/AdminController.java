package com.dell.controller;

import com.dell.dto.UserAssignment;
import com.dell.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AdminController {

    @Autowired
    private AdminRepo repo;
    @GetMapping("/assisgnments")
    public List<UserAssignment> assisgnments() {
        return repo.findAll();
    }
}
