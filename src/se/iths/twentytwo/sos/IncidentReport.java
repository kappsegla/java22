package se.iths.twentytwo.sos;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class IncidentReport {
    public static void main(String[] args) {

        List<Incident> incidents = new ArrayList<>();

        List<LowPriority> lowPriorities = new ArrayList<>();
        List<Emergency> emergencies = new ArrayList<>();

        incidents.add(new TrafficAccident());
        incidents.add(new CatInTree());
        incidents.add(new ChemicalLeak());


        for (Incident incident : incidents) {
            System.out.println(incident.timeStamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
            System.out.println(incident.description());
            incident.handle();
            System.out.println("------------------");
        }

    }
}
