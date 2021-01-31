package com.target.product.retailservice.exception;

import javax.servlet.http.HttpServletRequest;

public class ResourceNotFoundException extends  RuntimeException{
    public <T> ResourceNotFoundException(Class<T> clazz, Long resourceId){
        super(ResourceNotFoundException.generateResourceMessage(clazz.getSimpleName(),resourceId));
    }

    private static String generateResourceMessage(String entity, Long resourceId) {
        return "Resource "+ entity +"/" + resourceId + "is not known";
    }

    public ResourceNotFoundException(Class<?> clazz, HttpServletRequest request){
        super(ResourceNotFoundException.generateResourceMessage(clazz.getSimpleName(),request));
    }

    private static String generateResourceMessage(String simpleName, HttpServletRequest request) {
        return simpleName +"data is not available in database for " + request.getRequestURI();
    }

    public ResourceNotFoundException(){

    }
}
