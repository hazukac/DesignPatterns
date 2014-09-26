import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;
    private Vector<Entry> dir = new Vector<Entry>();
    public Directory(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getSize() {
        int totalSize = 0;
        Iterator itr = dir.iterator();
        while (itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            totalSize += entry.getSize();
        }
        return totalSize;
    }
    public Entry add(Entry entry) {
        this.dir.add(entry);
        return this;
    }
    public Iterator iterator() {
        return this.dir.iterator();
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}