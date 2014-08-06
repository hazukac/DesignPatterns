public class CharDisplay extends AbstractDisplay {
    private char ch;
    private String head = "<<";
    private String tail = ">>";

    public CharDisplay(char ch) {
        this.ch = ch;
    }
    public CharDisplay(String s) {
        // だめ this.ch = s.getBytes()[0];
        this.ch = s.charAt(0);
    }
    public void open() {
        System.out.print(this.head);
    }
    public void print() {
        System.out.print(this.ch);
    }
    public void close() {
        System.out.println(this.tail);
    }
}