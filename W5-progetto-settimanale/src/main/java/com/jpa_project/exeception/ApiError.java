package com.jpa_project.exeception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiError {
	
	private final String message;
	private final HttpStatus status;

}
