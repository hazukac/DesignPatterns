public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }
    public int getRows() {
        return 1 + this.display.getRows() + 1;
    }
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + this.makeLine('-', this.display.getColumns()) + "+";
        }
        if (row == this.display.getRows() + 1) {
            return "+" + this.makeLine('-', this.display.getColumns()) + "+";
        }
        return "|" + this.display.getRowText(row - 1) + "|";
    }
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
