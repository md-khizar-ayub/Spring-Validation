package com.mka.validation.advive;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handelException(MethodArgumentNotValidException methodArgumentNotValidException){
    Map<String,String> excepMap = new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach( e ->{
            excepMap.put(e.getField(),e.getDefaultMessage());
        });
        return excepMap;
    }
}
