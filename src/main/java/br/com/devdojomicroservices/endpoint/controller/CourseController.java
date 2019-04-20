package br.com.devdojomicroservices.endpoint.controller;

import br.com.devdojomicroservices.endpoint.dto.request.RegisterCourseRequest;
import br.com.devdojomicroservices.model.Course;
import br.com.devdojomicroservices.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author alexsandro
 */
@Slf4j
@RestController
@RequestMapping("v1/admin/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> all(Pageable pageable) {
        return new ResponseEntity<Iterable<Course>>(courseService.all(pageable), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getStatus(@PathVariable String id) {
        return new ResponseEntity<String>("ATIVO para o codigo: "+id, HttpStatus.OK);
    }

    @PostMapping
    public String registerCourse(@RequestBody RegisterCourseRequest request) {
        log.info("Titulo:" + request.getTitle());
        Course course = new Course();
        course.setTitle(request.getTitle());
        courseService.save(course);
        return "Deu certo!";
    }

}
