import framework.*;

public class Main {
    private static final char strongerDeco = '~';
    public static void main(String[] args) {

        // 登録
        bootstrap();

        // なんかするん
        someOperation1("strong message");
        someOperation2("simple box");
    }

    public static void bootstrap() {
        Manager manager = Manager.getMng();
        // {{{
        UnderlinePen ulpen = new UnderlinePen('~');
        MessageBox mb = new MessageBox('#');
        MessageBox simpleBox = new MessageBox('*');
        manager.register("strong message", ulpen);
        manager.register("congrats message", mb);
        manager.register("simple box", simpleBox);
        // }}}
    }

    public static void someOperation1(String method) {
        Manager manager = Manager.getMng();
        Product p1 = manager.create(method);
        p1.use("Hello, World!");
        /*
        UnderlinePen ul = new UnderlinePen(strongerDeco);
        ul.use("Hello, World!");
        */

        Product p2 = manager.create("congrats message");
        p2.use("田井中律誕生日おめでとう（あした）");

        Product p3 = manager.create("simple box");
        p3.use("hazukac");
    }

    public static void someOperation2(String method) {
        Manager manager = Manager.getMng();
        Product p1 = manager.create(method);
        p1.use("Hello, World!");
        /*
        UnderlinePen ul = new UnderlinePen(strongerDeco);
        ul.use("Hello, World!");
        */

        Product p2 = manager.create("congrats message");
        p2.use("平沢唯誕生日おめでとう 11/01");

        Product p3 = manager.create("simple box");
        p3.use("hazukac");
    }
    // コンパイル時に決定できない要素を取るようなインスタンス化が必要なクラス
    // は、registerを使わないと、再現できない？

    // めちゃくちゃ多い暮らす定義（*, /, (, &, %, ...) を管理したいのであれば
    // コンストラクタに * etcを取るクラスを用意してそれをnewすればいいのではないか

    // <-
    // newの箇所が100カ所だと、* -> / という要件が発生したとき
    // 100カ所直すじゃん

    // <-
    // public decochar = '*' -> '/'

    // <-
    // コンストラクタに渡す要素が、'*'だけじゃなかった場合、つらい

    // (1)
    // 事前把握できてるけれど、糞めんどい

    // (2)
    // 事前把握できないインスタンス化をしなきゃいけないとき
    // manager.register(time.Now().ToString(), instanceOfNow);

    // (3)
    // クラス名がわからない、クラス名を気にしないクラス名をつくりたいとき
}
