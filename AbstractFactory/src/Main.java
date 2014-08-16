import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使うファクトリ指定してくれ〜");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        // けいおん
        Tray htt = factory.createTray("放課後ティータイム");
        Link ritsu = factory.createLink("田井中律", "http://images.uncyc.org/ja/8/8c/Ritu.jpg");
        htt.add(ritsu);

        // ページそのもの
        Page page = factory.createPage("アニメのキャラ", "otiai10");
        page.add(htt);
        page.output();
    }
}