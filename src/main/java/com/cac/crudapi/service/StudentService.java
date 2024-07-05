package com.cac.crudapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cac.crudapi.entity.Student;
import com.cac.crudapi.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired

    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    public void delete(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}