package se.iths.twentytwo.sos;

import java.time.LocalDateTime;

public abstract class Disaster implements Incident {
    private LocalDateTime timeStamp;

    public Disaster() {
        timeStamp = LocalDateTime.now();
    }

    @Override
    public LocalDateTime timeStamp() {
        return timeStamp;
    }
}
