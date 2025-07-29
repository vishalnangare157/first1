package com.example.first.controller;

import com.example.first.model.Student;
import com.example.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")

    public String get()
    {
        return  "Hello Welcome to Docker Hub ";
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student student)
    {
        studentService.save(student);
        return student;
    }
}
