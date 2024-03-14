package es.codeurjc.mastercloudapps.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@RabbitListener(queues = "messagesJson", ackMode = "AUTO")
	public void received(ExampleData data) {
		
		System.out.println(data);
	}
}
