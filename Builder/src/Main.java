
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        Director director;
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        }
    }
    public static void usage() {
        System.out.println("引数に装飾の名前を渡して下さい");
    }
}