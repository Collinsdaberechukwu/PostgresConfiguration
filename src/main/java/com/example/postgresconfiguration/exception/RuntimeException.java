package com.example.postgresconfiguration.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class RuntimeException extends java.lang.RuntimeException{
    private String message;
    public RuntimeException(String message,HttpStatus httpStatus){
        this.message = message;
    }
}







//@Getter
//@Setter
//public class ResourceNotFoundException extends java.lang.RuntimeException {
//    private String message;
//    public ResourceNotFoundException(String message, HttpStatus httpStatus){
//        this.message = message;
//    }
//}