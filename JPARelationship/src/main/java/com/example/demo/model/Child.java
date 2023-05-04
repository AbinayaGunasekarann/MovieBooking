package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Child {
@Id
private int regno;
private String name;
private String dept;
private String email;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="courseid")
private Parent courses;

public Parent getCourses() {
	return courses;
}
public void setCourses(Parent courses) {
	this.courses = courses;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



}
