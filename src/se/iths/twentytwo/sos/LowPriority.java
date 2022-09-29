package se.iths.twentytwo.sos;

import java.time.LocalDateTime;

public abstract class LowPriority implements Incident {

    private LocalDateTime timeStamp;

    public LowPriority() {
        timeStamp = LocalDateTime.now();
    }

    @Override
    public LocalDateTime timeStamp() {
        return timeStamp;
    }
}
