package se.iths.twentytwo.lambda;

public class EnglishCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Hello from Sweden!");
    }
}
