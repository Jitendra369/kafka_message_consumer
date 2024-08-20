package com.zomatouser.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class kafkaConfiguration {

    @KafkaListener(topics = "${apache.kafaka.topic.local.update}", groupId = "${spring.kafka.consumer.group-id}")
    public void getUpdatedLocation(String locationValues){
        log.info("getting message in consumer "+ locationValues);
    }
}
