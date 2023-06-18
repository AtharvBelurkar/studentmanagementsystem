package com.studentmanagementsystem.sms.service.impl;

import com.studentmanagementsystem.sms.entity.Student;
import com.studentmanagementsystem.sms.service.StudentService;
import org.springframework.stereotype.Service;
import com.studentmanagementsystem.sms.repository.StudentRepository;

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
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public long countTotalStudent() {
        long id1 = 25l;
        long count = studentRepository.count();
        //return studentRepository.findById(id1).get();
        return count;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
