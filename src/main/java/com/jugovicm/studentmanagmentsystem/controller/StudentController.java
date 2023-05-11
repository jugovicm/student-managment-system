package com.jugovicm.studentmanagmentsystem.controller;

import com.jugovicm.studentmanagmentsystem.entity.Student;
import com.jugovicm.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super ();
        this.studentService = studentService;
    }
        //handler method to handle list students and return model and view
        @GetMapping("/students")
        public String listStudents(Model model){
            model.addAttribute ( "students", studentService.getAllStudents () );
            return "students";
        }
        @GetMapping("studnets/new")
        public String createStudentForm(Model model){
        //create student obj to hold student form data
            Student student = new Student ();
            model.addAttribute ( "student", student );
            return "create_student";
        }

        @PostMapping("/students")
        public String saveStudent(@ModelAttribute("student") Student student){
            studentService.saveStudent ( student );
            return "redirect:/students";
        }
}
