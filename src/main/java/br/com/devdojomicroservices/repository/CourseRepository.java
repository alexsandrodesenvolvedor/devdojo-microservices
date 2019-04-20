package br.com.devdojomicroservices.repository;

import br.com.devdojomicroservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
