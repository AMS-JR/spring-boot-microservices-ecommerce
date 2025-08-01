package com.eca.order_service.kafka.producer;

import com.eca.order_service.kafka.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderPlacedProducer {
    private final KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;

    public OrderPlacedProducer(KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishEvent(OrderPlacedEvent orderPlacedEvent) {

        try {
            kafkaTemplate.send("notificationTopic", orderPlacedEvent);
            log.info("ORDERPLACED EVNT SENT");
        } catch (Exception e) {
            log.error("Error sending OrderPlaced event: {}", orderPlacedEvent);
        }
    }
}
