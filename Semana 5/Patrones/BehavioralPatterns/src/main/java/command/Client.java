package command;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        invoker.executeOperation(new CopyCommand(new Receiver()));
        invoker.executeOperation(() -> receiver.paste());
        invoker.executeOperation(() -> receiver.cut());
    }
}
