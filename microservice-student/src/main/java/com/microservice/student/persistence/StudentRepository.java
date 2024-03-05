package com.microservice.student.persistence;

import com.microservice.student.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {

    @Query("SELECT s FROM Students s WHERE s.courseId = :idCourse")
    List<Students> findAllStudent(Long idCourse);

}
