package com.api.employeeSpringBootBackendApi.exception;

public class ApplicationNotFoundException extends RuntimeException {
    public ApplicationNotFoundException(String exception){
        super(exception);
    }
}
