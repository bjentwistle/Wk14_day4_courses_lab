package com.codeclan.example.courseservice.repositories;

import com.codeclan.example.courseservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findBystarRating(int starRating);

}
