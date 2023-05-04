package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Servicer;
import com.example.demo.model.Child;



@RestController
public class Controllerr {
   @Autowired
   Servicer ch;
   @GetMapping("/fetchAll")
   public List<Child> fetchAll()
   {
	  return  ch.fetchAll();
   }
   
}
