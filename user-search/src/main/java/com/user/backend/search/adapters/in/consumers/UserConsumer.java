package com.user.backend.search.adapters.in.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserConsumer {

    @KafkaListener(topics = "test")
    public void consume(String payload) {
        log.info("Consumed message: {}", payload);
    }
}
