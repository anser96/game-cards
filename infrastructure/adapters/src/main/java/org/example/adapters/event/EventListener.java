package org.example.adapters.event;


import com.google.gson.Gson;
import org.example.adapters.bus.RabbitMQEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<AuditEvent> {
    @Autowired
    private RabbitMQEventBus bus;

    @Override
    public void onApplicationEvent(AuditEvent event) {
        var entity = new Gson().toJson(event.getEntity());
        bus.publish(entity);
    }
}