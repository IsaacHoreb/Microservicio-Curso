package com.microservice.student.services;

import com.microservice.student.entities.Students;

import java.util.List;

public interface IStudentServices {

    List<Students> findAll();

    Students findById(Long id);

    void save(Students students);

    List<Students> findByIdCourse(Long idCourse);

}
