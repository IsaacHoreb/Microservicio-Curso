package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseServices {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    //Despues de crear la clase StudentByCourseResponse se agrega aca en el servicio
    StudentByCourseResponse findStudentsByIdCourse(Long id);

}
