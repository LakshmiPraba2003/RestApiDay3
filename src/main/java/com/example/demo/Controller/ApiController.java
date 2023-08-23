package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiModel;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
      @Autowired
      ApiService aser;
      
      @PostMapping("/addEmp")
      public ApiModel add(@RequestBody ApiModel am) {
    	  return aser.saveinfo(am);
      }
}
