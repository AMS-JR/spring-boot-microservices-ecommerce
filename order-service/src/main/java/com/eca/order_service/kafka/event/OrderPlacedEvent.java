package com.eca.order_service.kafka.event;

import lombok.*;
import org.springframework.context.ApplicationEvent;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class OrderPlacedEvent {
    private String orderNumber;

}
