package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService ss;

    // Add Student
    @PostMapping("/add")
    public void addStudent(@RequestBody Student s) {
        ss.add(s);
    }
	
    // Display All Students
    @GetMapping("/display")
    public List<Student> display() {
        return ss.display();
    }
    
   @DeleteMapping("/delete/{id}")
   
   public void delete(@PathVariable ("id")Integer Roll) {
	   ss.delete(Roll);
   }
   @PostMapping("update/{id}")
   public  Student update(@PathVariable Integer id ,@RequestBody Student s) {
       //TODO: process POST request
       
       return ss.update(s,id); 
   }
   
    
}