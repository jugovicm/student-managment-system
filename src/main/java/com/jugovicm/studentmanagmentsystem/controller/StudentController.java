package com.jugovicm.studentmanagmentsystem.controller;

import com.jugovicm.studentmanagmentsystem.entity.Student;
import com.jugovicm.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        @GetMapping("/students/edit/{id}")
        public String editStudentForm(@PathVariable Long id, Model model){
            model.addAttribute ( "student",studentService.getStudentById ( id ) );
            return "edit_student";
        }

        @PostMapping("/students/{id}")
        public String updateStudent(@PathVariable Long id,
                                    @ModelAttribute("student") Student student,
                                    Model model){
            Student existingStudent = studentService.getStudentById ( id );
            existingStudent.setId ( id );
            existingStudent.setFirstName ( student.getFirstName () );
            existingStudent.setLastName ( student.getLastName ());
            existingStudent.setEmail ( student.getEmail () );
            // save updated student
            studentService.updateStudent ( existingStudent );
            return "redirect:/students";
        }

    @GetMapping ("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById ( id );
        return "redirect:/students";
    }

}
