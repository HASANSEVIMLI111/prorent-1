package com.prorent.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prorent.carrental.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	
	
}
