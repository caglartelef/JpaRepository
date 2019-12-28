package com.caglartelef.jparepository.exceptions.exceptions;

public class RepositoryException extends RuntimeException {

    /**
     * Custom exception class
     * */
    public RepositoryException(String message) {
        super(message);
        System.out.println(message);
    }
}
