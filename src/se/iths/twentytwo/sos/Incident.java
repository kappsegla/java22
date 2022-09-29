package se.iths.twentytwo.sos;

import java.time.LocalDateTime;

public interface Incident {

    void handle();

    String description();

    LocalDateTime timeStamp();
}
