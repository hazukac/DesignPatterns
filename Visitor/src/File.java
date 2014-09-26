public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return this.name;
    }
    public int getSize() {
        return this.size;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}