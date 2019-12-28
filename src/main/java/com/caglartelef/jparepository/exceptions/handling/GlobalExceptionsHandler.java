package com.caglartelef.jparepository.exceptions.handling;

import com.caglartelef.jparepository.exceptions.exceptions.RepositoryException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionsHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RepositoryException.class)
    public String handleRepositoryException(RepositoryException exception) {
        return exception.getMessage();
    }

}
