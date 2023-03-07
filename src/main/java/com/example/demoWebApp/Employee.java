package com.example.demoWebApp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String Date;
private int age;
private String email;
public Employee(String name, String date, int age, String email) {
	this.name = name;
	Date = date;
	this.age = age;
	this.email = email;
}
public Employee() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
