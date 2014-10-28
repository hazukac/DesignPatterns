
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("hoge");
            System.exit(0);
        }
        BigString bigString = new BigString(args[0]);
        bigString.print();
    }
}