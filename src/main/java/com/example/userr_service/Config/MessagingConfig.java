package com.example.userr_service.Config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class MessagingConfig {
//    public static final String QUEUE = "exp_queue";
//    public static final String EXCHANGE = "exp_exchange";
//    public static final String ROUTING_KEY = "exp_routing_key";
//
//    @Bean
//    public Queue queue() {
//        return new Queue(QUEUE, true);
//    }
//
//    @Bean
//    public TopicExchange exchange() {
//        return new TopicExchange(EXCHANGE);
//    }
//
//    @Bean
//    public Binding binding() {
//        return BindingBuilder.bind(queue()).to(exchange()).with(ROUTING_KEY);
//    }
//
//    @Bean
//    public MessageConverter messageConverter() {
//        return new Jackson2JsonMessageConverter(); // Allows sending objects as JSON
//    }
//
//    @Bean
//    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
//        RabbitTemplate template = new RabbitTemplate(connectionFactory);
//        template.setMessageConverter(messageConverter());
//        return template;
//    }
//}
