package com.prorent.carrental.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prorent.carrental.domain.User;
import com.prorent.carrental.service.UserService;

@RestController
@RequestMapping
public class UserJWTController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<Map<String,Boolean>> registerUser(@Valid @RequestBody User user){
		userService.register(user);
		Map <String,Boolean> map=new HashMap<>();
		map.put("Register is Ok", true);
		return new ResponseEntity<>(map,HttpStatus.CREATED);
		//RegisterOK ok=new RegisterOK("Successfull");
		//return new ResponseEntity<>(ok,HttpStatus.CREATED);			
	}
	
/*	static class RegisterOK{
		
		private String message;
		
		RegisterOK(String message){
			this.setMessage(message);
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	
	}*/
	
}
