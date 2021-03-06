package net.tomofiles.rabbitmqtrial;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver3 {

    @RabbitListener(queues = RabbitmqTrialApplication.queueName)
    // @RabbitListener(queues = RabbitmqTrialApplication.queueName3)
    public void receiveMessage(String message) {
        System.out.println(getClass().getSimpleName() + " Received <" + message + ">");
    }
}