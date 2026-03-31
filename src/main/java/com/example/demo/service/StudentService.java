package com.example.demo.service;
import com.example.demo.model.Student;
import com.example.demo.validator.StudentValidator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentsInMemory = new ArrayList<>();
    private final StudentValidator validator = new StudentValidator();

    public List<Student> createStudents(List<Student> newStudents) {
        validator.validate(newStudents); // lève BadRequestException si invalide
        studentsInMemory.addAll(newStudents);
        return studentsInMemory;
    }

    public List<Student> getStudents() {
        return studentsInMemory;
    }
}