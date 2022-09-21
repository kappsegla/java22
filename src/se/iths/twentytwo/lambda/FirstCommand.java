package se.iths.twentytwo.lambda;

public class FirstCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Sweden!!");
    }
}
