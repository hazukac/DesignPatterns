import framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen ulpen = new UnderlinePen("~");
        manager.register("strong message", ulpen);

        Product p1 = manager.create("strong message");
        p1.use("Hello, World!");
    }
}