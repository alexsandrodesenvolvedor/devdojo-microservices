package br.com.devdojomicroservices.endpoint.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author alexsandro
 */
@Getter
@Setter
public class AbstractResponse implements Serializable {

    private String message;
    private int code;

}
