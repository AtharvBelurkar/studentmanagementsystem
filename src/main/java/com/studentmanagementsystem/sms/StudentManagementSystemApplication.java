package com.studentmanagementsystem.sms;

import com.studentmanagementsystem.sms.entity.Student;
import com.studentmanagementsystem.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Atharv", "Belurkar", "atharv@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Pratik", "Belurkar", "pratik@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Siddhesh", "Kamthe", "siddhesh@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Prathamesh", "Mane", "prathamesh@gmail.com");
//		studentRepository.save(student4);
	}
}
