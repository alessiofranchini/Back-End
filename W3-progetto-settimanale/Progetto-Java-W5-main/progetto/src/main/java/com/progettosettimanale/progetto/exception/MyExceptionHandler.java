package com.progettosettimanale.progetto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice  //controlla se si verificano eccezioni, e, nel caso, le gestisce
public class MyExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EntityExistsException.class)
	ResponseEntity<String> manageEntityExistsException(EntityExistsException e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.FOUND);
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	ResponseEntity<String> manageEntityNotFoundException(EntityNotFoundException e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
