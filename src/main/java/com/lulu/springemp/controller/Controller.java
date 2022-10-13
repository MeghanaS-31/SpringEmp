package com.lulu.springemp.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lulu.springemp.entity.Product;
import com.lulu.springemp.repo.ProductRepo;
import com.lulu.springemp.services.StorageService;

@CrossOrigin
@RestController

public class Controller {
    
	@Autowired
	ProductRepo productRepo;
    @RequestMapping("/hello")      //REST API End Point
    public String process() {
        
        return "<Marquee><H1>Hello Team, Start working its Monday</H1></Marquee>";
        
    }
    
    @PostMapping("/addproducts")
    public Product createproducts(@RequestBody Product product) {
        return productRepo.save(product);
    }
    
    @GetMapping("/getproducts")
    public List<Product> getProducts(){
    
        return productRepo.findAll();     //select * from product;
    }   
    
    @Autowired
	private StorageService service;

	@PostMapping
	public ResponseEntity<?> uploadImage(@RequestParam("image")MultipartFile file) throws IOException {
		String uploadImage = service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadImage);
	}

	@GetMapping("/{fileName}")
	public ResponseEntity<?> downloadImage(@PathVariable String fileName){
		byte[] imageData=service.downloadImage(fileName);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/png"))
				.body(imageData);

	}

}