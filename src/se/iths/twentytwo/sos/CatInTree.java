package se.iths.twentytwo.sos;

public class CatInTree extends LowPriority {


    @Override
    public void handle() {
        System.out.println("Call a guy with a ladder");
    }

    @Override
    public String description() {
        return "There is a cat sitting in a tree";
    }
}
