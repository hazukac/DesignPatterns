package factory;
import java.util.Vector;

public abstract class Tray extends Item {
    protected Vector<Item> tray = new Vector<Item>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        this.tray.add(item);
    }
}