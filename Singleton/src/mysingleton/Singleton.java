// packageがさいしょじゃないといけないっぽい？
package mysingleton;

import java.util.Date;

public class Singleton {
    // ここがみそ
    private static Singleton instance;
    // private Singleton() {}
    public String hoge;
    public Date initializedAt;

    // TODO: otiai10
    // プロセスとはなにか、スレッドとはなにか

    // TODO: otiai10
    // singletonディスりについてしらbてくる

    // TODO: otiai10
    // 先生ほしい 

    // defaultだと、同じパッケーじからアクセスできるので
    // default Singleton(String x) {
    private Singleton(String x) {
        this.hoge = x;
        this.initializedAt = new Date();
    }

    // getInstanceでsynchronizedするべきか
    // Classのロード時に先にinstanceかしといちゃうか
    public static synchronized Singleton getInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton("foo");
        }
        return Singleton.instance;
    }
}
