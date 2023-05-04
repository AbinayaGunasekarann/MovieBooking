package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Parent;

public interface ParentRepo extends JpaRepository<Parent,Integer> {

}
