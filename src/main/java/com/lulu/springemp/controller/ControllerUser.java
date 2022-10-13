package com.lulu.springemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.Order;
import com.lulu.springemp.entity.User;
import com.lulu.springemp.repo.OrderRepo;
import com.lulu.springemp.repo.UserRepo;

@CrossOrigin
@RestController

public class ControllerUser {

	@Autowired
	UserRepo userRepo;
    
    @PostMapping("/addusers")
    public User createusers(@RequestBody User user) {
        return userRepo.save(user);
    }
    
    @GetMapping("/getusers")
    public List<User> getusers(){
    
        return userRepo.findAll();     //select * from product;
    }   
    
    @DeleteMapping("/deleteusers/{id}")
    public String  deleteUser(@PathVariable("id") int id)
    {
        userRepo.deleteById(id);
        System.out.println("Record got Deleted");
        return  "Is deleted";
        
    }
    @DeleteMapping("/deleteusers/{id1}/{id2}")
    public String  deleteUserss(@PathVariable("id1") int id1, @PathVariable("id2") int id2)
    {
        userRepo.deleteById(id1);
        userRepo.deleteById(id2);
        System.out.println("Records got Deleted");
        return  "Is deleted";
        
    }
    
    @PutMapping("/users/{id}")   //
    public ResponseEntity<User> updatedUser(@PathVariable ("id") int id, @RequestBody User userbypostman){
        User user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not exist with id :" + id));
        
        user.setId(userbypostman.getId());
        user.setName(userbypostman.getName());
        user.setMailid(userbypostman.getMailid());
        user.setPassword(userbypostman.getPassword());
        
        User updatedUser = userRepo.save(user);
        return ResponseEntity.ok(updatedUser);
    }
    
    
}