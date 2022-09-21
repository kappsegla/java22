package se.iths.twentytwo.lambda;

public class CommandDemo {
    public static void main(String[] args) {

        Command firstCommand = new FirstCommand();
        handleCommand(firstCommand);

        Command secondCommand = new SecondCommand();
        handleCommand(secondCommand);
    }

    public static void handleCommand(Command theCommand) {
        System.out.println("This is handleCommand ready to execute the command.");
        theCommand.execute();
    }
}
