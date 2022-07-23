package org.example.adapters.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublish<T> {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publish(T entity) {
        publisher.publishEvent(new AuditEvent<T>(entity));
    }
}
