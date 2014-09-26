
public class Trouble {
    private int number;
    public Trouble(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    public String toString() {
        // string + int ??
        return "[TROUBLE " + this.number + "]";
    }
}