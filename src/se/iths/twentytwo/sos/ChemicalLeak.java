package se.iths.twentytwo.sos;

public class ChemicalLeak extends Disaster {
    @Override
    public void handle() {
        System.out.println("Run, run, run....");
    }

    @Override
    public String description() {
        return "Smells funny";
    }
}
