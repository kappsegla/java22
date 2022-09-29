package se.iths.twentytwo.sos;

import java.time.LocalDateTime;

public abstract class Emergency implements Incident {

    private LocalDateTime timeStamp;

    public Emergency() {
        timeStamp = LocalDateTime.now();
    }

    @Override
    public LocalDateTime timeStamp() {
        return timeStamp;
    }
}
