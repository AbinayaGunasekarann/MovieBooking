package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ChildRepo;
import com.example.demo.model.Child;

@Service
public class Servicer {
	@Autowired
	ChildRepo rep;
	public List<Child> fetchAll()
	 {
		 return rep.findAll();
	 }
	

}
