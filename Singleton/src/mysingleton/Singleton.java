package mysingleton;
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public String hoge;
    Singleton(String x) {
        this.hoge = x;
    }
    public static synchronized Singleton getInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton("foo");
        }
        return Singleton.instance;
    }
    public static void main(String[] args) {
        System.out.println("Hi, this is singleton demo.");
    }
}