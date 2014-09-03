import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使うファクトリ指定してくれ〜");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Page page = factory.createPage("アニメのキャラ", "otiai10");
        Tray htt = factory.createTray("放課後ティータイム");
        Link ritsu = factory.createLink("田井中律", "http://images.uncyc.org/ja/8/8c/Ritu.jpg");
        Tray muse = factory.createTray("μ's");
        Link nozomi = factory.createLink("のぞみ", "http://images.uncyc.org/ja/8/8c/Ritu.jpg");

        htt.add(ritsu);
        muse.add(nozomi);
        page.add(htt);
        page.add(muse);
        page.output();
    }
    /**
     * アプリケーションレイヤーでは、ページのコンテンツしか定義してない。
     * ページの構造や、**つくりかた**についても、アプリケーションは感知してない。
     * ページレイアウトの変更があった場合は、具体的なFactoryクラスを
     * 新たに作って、指定すればいいだけ。
     * ∵
     * AbstractなFactoryというクラスを最初に定義して
     * Mainはそれだけを参照することで
     * 具体的なFactoryに依存しない
     */
}