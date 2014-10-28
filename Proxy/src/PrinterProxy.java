
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;
    public PrinterProxy() {}
    public PrinterProxy(String name) {
        this.name = name;
    }
    public synchronized void setName(String name) {
        if (this.real != null) {
            this.real.setName(name);
        }
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void print(String string) {
        this.realize();
        this.real.print(string);
    }
    private synchronized void realize() {
        if (this.real == null) {
            this.real = new Printer(this.name);
        }
    }
}