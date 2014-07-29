
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        this.showWithParen();
    }
    public void printStrong() {
        this.showWithAster();
    }
}