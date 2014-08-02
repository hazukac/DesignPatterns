public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('A');
        AbstractDisplay d2 = new StringDisplay("Hello, World!!");
        AbstractDisplay d3 = new StringDisplay("Hoge Fuga Piyo");

        d1.display();
        d2.display();
        d3.display();
    }
}