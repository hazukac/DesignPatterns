
public class Main {
    public static void  main(String[] args) {
        // PrintBannerじゃだめなのか？
        Print p = new PrintBanner("Hello!!");
        p.printWeak();
        p.printStrong();
    }
}
