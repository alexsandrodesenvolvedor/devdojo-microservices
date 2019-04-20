package br.com.devdojomicroservices.service;

import br.com.devdojomicroservices.model.Course;
import br.com.devdojomicroservices.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author alexsandro
 */
@Slf4j
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Iterable<Course> all(Pageable pageable) {
        log.info("Listing all courses...");
        Iterable<Course> all = courseRepository.findAll();
        return all;
    }

    public void save(Course course) {
        courseRepository.save(course);
    }

}
