package com.user.backend.search.adapters.in.consumers;

import com.user.backend.search.adapters.in.consumers.payload.PayloadKafka;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserConsumer {

    @KafkaListener(topics = "string", containerFactory = "kafkaListenerContainerFactoryString")
    public void consume(String payload) {
        log.info("Consumed message: {}", payload);
    }

    @KafkaListener(topics = "user_db.public.user_db", containerFactory = "kafkaListenerContainerFactoryJson")
    public void consume1(@Payload PayloadKafka payload) {
        log.info("Consumed1 message: {}", payload);
    }
}
