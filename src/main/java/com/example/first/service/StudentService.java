package com.example.first.service;

import com.example.first.model.Student;
import com.example.first.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student save(Student student)
    {
        studentRepo.save(student);
        return student;
    }
}


