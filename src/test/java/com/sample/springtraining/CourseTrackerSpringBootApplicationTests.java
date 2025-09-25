package com.sample.springtraining;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import com.sample.springtraining.repositories.CourseRepository;

@SpringBootTest
@ActiveProfiles("test")
@Sql(scripts = "classpath:data-h2.sql", executionPhase = org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD)
public class CourseTrackerSpringBootApplicationTests {

    // private final CourseRepository courseRepository;

    // @Autowired
    // public CourseTrackerSpringBootApplicationTests(CourseRepository courseRepository) {
    //     this.courseRepository = courseRepository;
    // }

    // @Test
    // void t1() {
    //     Pageable pageable = PageRequest.of(0, 5, Sort.by(Sort.Direction.ASC, "id"));
    //     Page<?> firstPage = courseRepository.findAll(pageable);
    //     assertThat(firstPage.getNumberOfElements()).isEqualTo(5);
    //     assertThat(firstPage.getNumber()).isEqualTo(0);

    //     Pageable nextPageable = pageable.next();
    //     Page<?> secondPage = courseRepository.findAll(nextPageable);
    //     assertThat(secondPage.getNumberOfElements()).isEqualTo(5);
    //     assertThat(secondPage.getNumber()).isEqualTo(1);
    // }
    // @Test
    // public void givenCreateCourseWhenLoadTheCourseThenExpectSameCourse() {
    // Course course = new Course("Rapid Spring BootApplication Development",
    // "Spring", 4,
    // "Spring Boot gives all the power of the Spring Framework without all of the
    // complexities");
    // Course savedCourse = courseRepository.save(course);
    // Course found = courseRepository.findById(savedCourse.getId()).orElseThrow();
    // assertThat(found)
    // .usingRecursiveComparison()
    // .ignoringFields("id")
    // .isEqualTo(course);
    // }

    // @Test
    // public void givenUpdateCourseWhenLoadTheCourseTheExpectUpdatedCourse() {
    // Course course = new Course("Rapid Spring BootApplication Development",
    // "Spring", 4,
    // "Spring Boot gives all the power of the Spring Framework without all of the
    // complexities");
    // courseRepository.save(course);
    // course.setRating(5);
    // Course savedCourse = courseRepository.save(course);

    // assertThat(courseRepository.findById(savedCourse.getId()).get().getRating()).isEqualTo(5);
    // }

    // @Test
    // public void givenDeleteCourseWhenLoadTheCourseThenExpectNoCourse() {
    // Course course = new Course("Rapid Spring BootApplication Development",
    // "Spring", 4,
    // "Spring Boot gives all the power of the Spring Framework without all of the
    // complexities");
    // Course savedCourse = courseRepository.save(course);

    // Course found = courseRepository.findById(savedCourse.getId()).orElseThrow();
    // assertThat(found)
    // .usingRecursiveComparison()
    // .ignoringFields("id")
    // .isEqualTo(course);

    // courseRepository.delete(course);
    // assertThat(courseRepository.findById(savedCourse.getId())).isEmpty();
    // }
}
