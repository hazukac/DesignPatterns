import mysingleton.*;
public class Main {
    public static void main (String[] args) {
        System.out.println("This is main.");
        Singleton theInstance;
        theInstance = Singleton.getInstance();
        System.out.printf(theInstance.hoge);
    }
}