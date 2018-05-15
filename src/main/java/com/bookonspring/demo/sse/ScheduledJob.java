package com.bookonspring.demo.sse;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledJob {

    public final ApplicationEventPublisher eventPublisher;

    public ScheduledJob(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Scheduled(fixedRate = 1000)
    public void publishUserCount() {
        this.eventPublisher.publishEvent(new UserCount());
    }
}