package com.example.responder1synckafkapoc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;


@Component
public class ReplyingKafkaConsumer {

    @KafkaListener(topics = "${requestReplyTopic}")
    @SendTo
    public String listen(String request) throws InterruptedException {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Message consumed");
        System.out.println();
        System.out.println();
        System.out.println();


//        int sum = request.getFirstNumber() + request.getSecondNumber();
//        request.additionalProperties.put("sum", sum);
        return request + "HI";
    }

}
