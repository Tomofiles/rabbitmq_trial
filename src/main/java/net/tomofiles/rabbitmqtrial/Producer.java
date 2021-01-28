package net.tomofiles.rabbitmqtrial;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/send")
    public void send(@RequestBody String message) {
        System.out.println("Sending message... [" + message + "]");
        this.rabbitTemplate.convertAndSend(RabbitmqTrialApplication.exchangeName, "", message);
    }
}