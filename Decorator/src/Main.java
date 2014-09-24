public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1,'#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(b3, ':');
        b4.show();

        Display b5 = new FullBorder(b4);
        b5.show();
    }
}
/*
public abstract class Foo {
    public Foo() {}
}
*/
/*
public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
    }
}
*/
/* 結果
Main.java:3: Foo は abstract です。インスタンスを生成することはできません。
        Foo foo = new Foo();
                  ^
エラー 1 個
 */
