package com.codeclan.example.courseservice.controller;

import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.repositories.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class CourseController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping(value = "/courses")
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    @GetMapping(value = "/courses/{id}")
    public Optional<Course> getCourse(@PathVariable Long id) {
        return courseRepo.findById(id);
    }

}
