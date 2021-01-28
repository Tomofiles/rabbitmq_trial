package net.tomofiles.rabbitmqtrial;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver1 {

    @RabbitListener(queues = RabbitmqTrialApplication.queueName)
    // @RabbitListener(queues = RabbitmqTrialApplication.queueName1)
    public void receiveMessage(String message) {
        System.out.println(getClass().getSimpleName() + " Received <" + message + ">");
    }
}