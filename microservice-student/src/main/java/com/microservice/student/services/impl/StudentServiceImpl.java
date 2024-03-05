package com.microservice.student.services.impl;

import com.microservice.student.entities.Students;
import com.microservice.student.persistence.StudentRepository;
import com.microservice.student.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Students findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Students students) {
        studentRepository.save(students);
    }

    @Override
    public List<Students> findByIdCourse(Long idCourse) {
        return studentRepository.findAllStudent(idCourse);
    }

}
