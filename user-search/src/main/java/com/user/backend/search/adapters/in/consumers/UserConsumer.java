package com.user.backend.search.adapters.in.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.user.backend.search.adapters.in.consumers.mapper.UserConsumerMapper;
import com.user.backend.search.adapters.in.consumers.payload.PayloadKafka;
import com.user.backend.search.application.ports.in.UserCreateUpdateInputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserConsumer {

    private final UserCreateUpdateInputPort userCreateUpdateInputPort;
    private final UserConsumerMapper userConsumerMapper;

    public UserConsumer(
            UserCreateUpdateInputPort userCreateUpdateInputPort,
            UserConsumerMapper userConsumerMapper
    ) {
        this.userCreateUpdateInputPort = userCreateUpdateInputPort;
        this.userConsumerMapper = userConsumerMapper;
    }

    @KafkaListener(topics = "user_db.public.user_db", containerFactory = "kafkaListenerContainerFactoryJson")
    public void userDbConsumer(@Payload PayloadKafka payload) throws JsonProcessingException {
        log.info("Consuming user_db.public.user_db topic");
        userCreateUpdateInputPort.createUpdateUser(userConsumerMapper.fromUserDbPayloadToUserDomain(payload.getPayload().getAfter()));
        log.info("Consumed user_db.public.user_db topic");
    }
}
