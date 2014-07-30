
public class PrintBanner extends Print {
// public class PrintBanner implements Print {
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
// なるほど
// なんでふたつあるか
// 仕事をイメージして
// PrintもBannerもclassだったら、ふたつextendsできない
// 委譲せざるをえない
