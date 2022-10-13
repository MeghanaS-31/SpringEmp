package com.lulu.springemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.Order;
import com.lulu.springemp.repo.OrderRepo;

@CrossOrigin
@RestController


public class ControllerOrder {
	@Autowired
	OrderRepo orderRepo;
    
    @PostMapping("/addorders")
    public Order createorders(@RequestBody Order order) {
        return orderRepo.save(order);
    }
    
    @GetMapping("/getorders")
    public List<Order> getorders(){
    
        return orderRepo.findAll();     //select * from product;
    }   
}