public class Main {
    public static void main(String[] args) {
        try {
            // {{{
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");

            Directory bindir = new Directory("bin");
            rootdir.append(bindir);
            Directory tmpdir = new Directory("tmp");
            rootdir.append(tmpdir);
            Directory usrdir = new Directory("usr");
            rootdir.append(usrdir);
            // }}}

            File gochiusa = new File("こころぴょんぴょん.txt", 1000);
            tmpdir.append(gochiusa);

            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
