package com.eca.notification_service.kafka.consumer;

import com.eca.notification_service.kafka.event.OrderPlacedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderPlacedConsumer {
//    private final ObservationRegistry observationRegistry;
//    private final Tracer tracer;
    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
//        Observation.createNotStarted("on-message", this.observationRegistry).observe(() -> {
            log.info("Got message <{}>", orderPlacedEvent);
//            log.info("TraceId- {}, Received Notification for Order - {}", this.tracer.currentSpan().context().traceId(),
//                    orderPlacedEvent.getOrderNumber());
//        });
        // send out an email notification
    }
}
