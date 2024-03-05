package com.microservice.student.controllers;

import com.microservice.student.entities.Students;
import com.microservice.student.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/student")
public class StudentControllers {

    @Autowired
    private IStudentServices studentServices;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudents(@RequestBody Students students) {
        studentServices.save(students);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentServices.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(studentServices.findById(id));
    }

    //EndPoint para ser consumido por el msvc-students
    @GetMapping("/search-by-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable("idCourse") Long idCourse) {
        return ResponseEntity.ok(studentServices.findByIdCourse(idCourse));
    }


}
