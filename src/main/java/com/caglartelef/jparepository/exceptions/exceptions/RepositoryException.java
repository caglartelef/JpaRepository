package com.caglartelef.jparepository.exceptions.exceptions;

public class RepositoryException extends RuntimeException {

    public RepositoryException(String message) {
        super(message);
        System.out.println(message);
    }
}
