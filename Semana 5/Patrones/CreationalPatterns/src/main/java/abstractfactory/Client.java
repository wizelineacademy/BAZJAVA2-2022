package abstractfactory;

import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.LinuxFactory;
import abstractfactory.factories.MacOSFactory;
import abstractfactory.factories.WindowsFactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Application app;
        GUIFactory factory;

        System.out.println("Choose an OS to render the app?");
        System.out.println("1.- MacOs");
        System.out.println("2.- Windows");
        System.out.println("3.- Linux");
        Scanner scan = new Scanner(System.in);
        int osOption = scan.nextInt();

        if (osOption == 1) {
            factory = new MacOSFactory();
        } else if (osOption == 2){
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }

        app = new Application(factory);
        app.paint();
    }
}
