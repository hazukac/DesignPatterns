
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        this.banner.showWithParen();
    }
    public void printStrong() {
        this.banner.showWithAster();
    }
}