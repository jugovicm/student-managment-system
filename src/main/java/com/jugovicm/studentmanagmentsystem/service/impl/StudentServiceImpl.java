package com.jugovicm.studentmanagmentsystem.service.impl;

import com.jugovicm.studentmanagmentsystem.entity.Student;
import com.jugovicm.studentmanagmentsystem.repository.StudentRepository;
import com.jugovicm.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    //only one constructor in Bean -> no @AutoWierd annotation
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll ();
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save ( student );
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById ( id ).get ();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save ( student );
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById ( id );
    }
}
