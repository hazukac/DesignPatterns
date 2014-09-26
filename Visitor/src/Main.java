public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");

            Directory bindir = new Directory("bin");
            rootdir.add(bindir);

            bindir.add(new File("vi", 10000));
            bindir.add(new File("git", 100000));

            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}