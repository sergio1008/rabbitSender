package com.serbernal.rabbittest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serbernal.rabbittest.dto.PersonaDTO;
import com.serbernal.rabbittest.rabbitmq.Sender;

@RestController
public class MessagesRestController {

    @Autowired
	private Sender sender;
	
    @GetMapping("/message")
	public ResponseEntity<String> guardarMensaje(@RequestParam(name = "mensaje") String message){
    	PersonaDTO dto = new PersonaDTO();
    	dto.setNombre(message);
		sender.sendMessage(dto);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
