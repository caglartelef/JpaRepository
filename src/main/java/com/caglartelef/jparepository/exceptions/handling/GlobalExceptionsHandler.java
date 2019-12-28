package com.caglartelef.jparepository.exceptions.handling;

import com.caglartelef.jparepository.exceptions.exceptions.RepositoryException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/***
 *  Global exception handler.
 *  This catcher only captures the error message from classes that use @RestController annotation.
 */
@RestControllerAdvice
public class GlobalExceptionsHandler {


    /**
     * When the system throws an RepositoryException, we catch it.
     * We throw a special error message by turning it into a meaningful message.
     * */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RepositoryException.class)
    public String handleRepositoryException(RepositoryException exception) {
        return exception.getMessage();
    }

}
