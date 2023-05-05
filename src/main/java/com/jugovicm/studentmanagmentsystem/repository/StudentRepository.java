package com.jugovicm.studentmanagmentsystem.repository;

import com.jugovicm.studentmanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
