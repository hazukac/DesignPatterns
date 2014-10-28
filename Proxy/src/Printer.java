
public class Printer implements Printable {
    private String name;
    public Printer() {
        this.someHeavyJob("It needs a lot of time to create Printer instance...");
    }
    public Printer(String name) {
        this.name = name;
        this.someHeavyJob("It needs a lot of time to create " + this.name + " instance...");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void print(String string) {
        System.out.println("==== " + this.name + " ====");
        System.out.println(string);
    }
    private void someHeavyJob(String message) {
        System.out.println(message);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // do something
            }
            System.out.print(".");
        }
        System.out.println("\nFinished.");
    }
}