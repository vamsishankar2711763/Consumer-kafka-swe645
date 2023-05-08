package com.ram.kafkademo.service;

import com.ram.kafkademo.model.Form;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService
{
	@KafkaListener(topics = "FormsTopic", groupId = "Group100",containerFactory = "formListener")
	public void listen(Form form)
	{
		System.out.println("Received '" + form +"' from the FormTopic." );
	}
}
