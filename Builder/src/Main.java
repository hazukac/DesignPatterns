
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        Director director;
        if (args[0].equals("plain")) {
            TextBuilder builder = new TextBuilder();
            director = new Director(builder);
            director.construct();
            System.out.println(builder.getResult());
        }
    }
    public static void usage() {
        System.out.println("ほげ");
    }
}