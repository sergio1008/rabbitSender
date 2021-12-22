package com.serbernal.rabbittest.rabbitmq;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serbernal.rabbittest.dto.PersonaDTO;

@Component
public class Sender {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(PersonaDTO message) {
		System.out.println("[Application] Enviando el mensaje \"" + message + "\"...");

		rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, message);

	}
}
