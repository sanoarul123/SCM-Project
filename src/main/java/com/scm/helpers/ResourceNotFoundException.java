package com.scm.helpers;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){
        super();


    }
    public ResourceNotFoundException(){
        super("Resource Not Found");
    }

}
