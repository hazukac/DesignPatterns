public class SideBorder extends Border {
    private char borderChar;
    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }
    public int getRows() {
        return this.display.getRows();
    }
    public String getRowText(int row) {
        return this.borderChar + this.display.getRowText(row) + this.borderChar;
    }
}
