public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    // final: overrideできない
    public final void show() {
        for (int i = 0; i < this.getRows(); i++) {
            System.out.println(this.getRowText(i));
        }
    }
}
