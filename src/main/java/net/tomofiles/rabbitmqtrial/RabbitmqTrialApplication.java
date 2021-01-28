package net.tomofiles.rabbitmqtrial;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqTrialApplication {

	static final String exchangeName = "spring-boot-exchange";
	static final String queueName = "spring-boot-queue";
	// static final String queueName1 = "spring-boot-queue-1";
	// static final String queueName2 = "spring-boot-queue-2";
	// static final String queueName3 = "spring-boot-queue-3";
  
	@Bean
	public FanoutExchange exchange() {
	  	return new FanoutExchange(exchangeName, false, true);
	}

	@Bean
	public Queue queue() {
	  	return new Queue(queueName, false, false, true);
	}
  
	// @Bean
	// public Queue queue1() {
	//   	return new Queue(queueName1, false, false, true);
	// }
  
	// @Bean
	// public Queue queue2() {
	//   	return new Queue(queueName2, false, false, true);
	// }
  
	// @Bean
	// public Queue queue3() {
	//   	return new Queue(queueName3, false, false, true);
	// }
  
	@Bean
	public Binding binding(Queue queue, FanoutExchange exchange) {
	  	return BindingBuilder.bind(queue).to(exchange);
	}
  
	// @Bean
	// public Binding binding1(@Qualifier("queue1") Queue queue, FanoutExchange exchange) {
	//   	return BindingBuilder.bind(queue).to(exchange);
	// }

	// @Bean
	// public Binding binding2(@Qualifier("queue2") Queue queue, FanoutExchange exchange) {
	//   	return BindingBuilder.bind(queue).to(exchange);
	// }

	// @Bean
	// public Binding binding3(@Qualifier("queue3") Queue queue, FanoutExchange exchange) {
	//   	return BindingBuilder.bind(queue).to(exchange);
	// }

	public static void main(String[] args) {
	  	SpringApplication.run(RabbitmqTrialApplication.class, args);
	}
}
