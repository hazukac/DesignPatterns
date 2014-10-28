
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("Current name: " + p.getName());
        p.setName("Bob");
        System.out.println("Current name: " + p.getName());
        p.print("Hello, world.");
    }
}