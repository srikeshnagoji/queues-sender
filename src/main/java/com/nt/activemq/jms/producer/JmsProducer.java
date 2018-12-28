package com.nt.activemq.jms.producer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.nt.activemq.model.Customer;

@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${nt.activemq.queue}")
	String queue;
	
	public void send(Customer customer){
		System.out.println("SENT Message: " + customer);
		jmsTemplate.convertAndSend(queue, customer);
	}
	
	//here
	public void send(List list){
		System.out.println("SENT Message: " + list);
		jmsTemplate.convertAndSend(queue, list);
	}
}