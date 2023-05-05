package com.jugovicm.studentmanagmentsystem.service.impl;

import com.jugovicm.studentmanagmentsystem.entity.Student;
import com.jugovicm.studentmanagmentsystem.repository.StudentRepository;
import com.jugovicm.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll ();
    }
}
