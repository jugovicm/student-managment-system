package com.jugovicm.studentmanagmentsystem;

import com.jugovicm.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student ("Milica", "Jugovic", "jugmic@yahoo.com");
		studentRepository.save ( student1 );
		Student student2 = new Student ("Bogdan", "Jugovic", "jugbogdan@yahoo.com");
		studentRepository.save ( student2 );
		Student student3 = new Student ("Veljko", "Markovic", "marvelj@yahoo.com");
		studentRepository.save ( student3 );*/
	}
}
