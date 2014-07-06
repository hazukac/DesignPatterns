// staticなプロパティって接頭語無しでアクセスできるん？という疑問
public class Test {
    private int hoge;
    private static int fuga;
    public static int getHoge() {
        // return hoge;
        // Test.java:4: static でない 変数 hoge を static コンテキストから参照することはできません。
        return fuga;
    }
}