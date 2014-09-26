import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = "";
    public void visit(File file) {
        System.out.println(this.currentDir + "/" + file.toString());
    }
    public void visit(Directory directory) {
        System.out.println(this.currentDir + "/" + directory.toString());
        String saveDir = this.currentDir;
        this.currentDir = this.currentDir + "/" +  directory.getName();
        Iterator itr = directory.iterator();
        while (itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            entry.accept(this);
        }
        this.currentDir = saveDir;
    }
}