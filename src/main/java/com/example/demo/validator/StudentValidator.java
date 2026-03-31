package com.example.demo.validator;
import com.example.demo.model.Student;

import java.util.List;

public class StudentValidator {

    public void validate(List<Student> students) {
        for (Student s : students) {
            if (s.getReference() == null || s.getReference().isBlank()) {
                throw new BadRequestException("NewStudent.reference cannot be null or blank");
            }
            if (s.getFirstName() == null || s.getFirstName().isBlank()) {
                throw new BadRequestException("NewStudent.firstName cannot be null or blank");
            }
            if (s.getLastName() == null || s.getLastName().isBlank()) {
                throw new BadRequestException("NewStudent.lastName cannot be null or blank");
            }
        }
    }
}
