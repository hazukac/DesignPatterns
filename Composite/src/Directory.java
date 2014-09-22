import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;
    private Vector directory = new Vector();
    public Directory(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getSize() {
        int size = 0;
        Iterator itr = this.directory.iterator();
        while (itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {
        this.directory.add(entry);
        return this;
    }
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        Iterator itr = this.directory.iterator();
        while (itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            entry.printList(prefix + "/" + this.name);
        }
    }
}
