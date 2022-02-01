package com.prorent.carrental.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prorent.carrental.domain.Message;
import com.prorent.carrental.service.MessageService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/message")
public class MessageController {
	
//	@Autowired
	private MessageService messageService;
	
	private static Logger logger=LoggerFactory.getLogger(MessageController.class);

//	public MessageController(MessageService messageService) {
//		this.messageService=messageService;
//	}

	
	//Request
	//Response
	@PostMapping
	public ResponseEntity<Message> createMessage(@Valid @RequestBody Message message ){
		Message savedMessage = messageService.createMessage(message);
		return new ResponseEntity<Message>(savedMessage,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Message> getMessage(@PathVariable Long id){
		Message foundMessage = messageService.getMessage(id);
		return ResponseEntity.ok(foundMessage);
	}

	
}
