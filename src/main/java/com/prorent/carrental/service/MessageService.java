package com.prorent.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prorent.carrental.domain.Message;
import com.prorent.carrental.exception.ResourceNotFoundException;
import com.prorent.carrental.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public Message createMessage(Message message) {
		return messageRepository.save(message);
	}

	public Message getMessage(Long id) {
		Message foundMessage = messageRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id not found:" + id));
		return foundMessage;
	}

}
