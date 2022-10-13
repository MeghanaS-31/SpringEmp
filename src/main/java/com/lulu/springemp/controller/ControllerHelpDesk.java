package com.lulu.springemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.HelpDesk;
import com.lulu.springemp.repo.HelpDeskRepo;

@CrossOrigin
@RestController

public class ControllerHelpDesk {

	@Autowired
	HelpDeskRepo HelpDeskRepo;
    
    @PostMapping("/addhelpdesk")
    public HelpDesk createhelpdesk(@RequestBody HelpDesk helpdesk) {
        return HelpDeskRepo.save(helpdesk);
    }
    
    @GetMapping("/gethelpdesk")
    public List<HelpDesk> gethelpdesk(){
    
        return HelpDeskRepo.findAll();     //select * from product;
    }   

}