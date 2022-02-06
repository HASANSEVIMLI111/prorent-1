package com.prorent.carrental.exception;

//@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {
	public ConflictException(String message) {
		super(message);
	}

}
