package com.sample.springtraining.services;

import org.springframework.stereotype.Service;

import com.sample.springtraining.models.Course;
import com.sample.springtraining.repositories.CourseRepository;

import io.micrometer.core.instrument.Counter;

@Service
public class CourseService {

    private final Counter createCourseCounter;
    private final CourseRepository courseRepository;

    public CourseService(Counter createCourseCounter, CourseRepository courseRepository) {
        this.createCourseCounter = createCourseCounter;
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        createCourseCounter.increment();
        return courseRepository.save(course);
    }
}
