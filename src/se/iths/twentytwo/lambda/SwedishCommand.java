package se.iths.twentytwo.lambda;

public class SwedishCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Hej från Sverige!");
    }
}
