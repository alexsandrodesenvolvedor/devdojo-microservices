package br.com.devdojomicroservices.endpoint.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;

/**
 * @author alexsandro
 */
public class RegisterCourseRequest implements Serializable {

    @Getter
    @Setter
    private String title;

}
