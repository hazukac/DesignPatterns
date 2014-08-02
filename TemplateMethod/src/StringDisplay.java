public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    private String separator = "|";
    private String lineSeparator = "+";
    private String lineContent = "-";
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open() {
        this.printLine();
    }
    public void print() {
        System.out.println(this.separator + this.string + this.separator);
    }
    public void close() {
        this.printLine();
    }
    private void printLine() {
        System.out.print(this.lineSeparator);
        for (int i = 0; i < this.width; i++) {
            System.out.print(this.lineContent);
        }
        System.out.println(this.lineSeparator);
    }
}