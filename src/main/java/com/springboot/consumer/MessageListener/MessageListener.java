package com.springboot.consumer.MessageListener;

import com.springboot.consumer.CustomMessage.CustomMessage;
import com.springboot.consumer.MQConfig.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}
