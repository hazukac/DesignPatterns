// <program> ::= program <command list>

public class ProgramNode extends Node {
    private Node commandListNode;
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        this.commandListNode = new CommandListNode();
        this.commandListNode.parse(context);
    }
    public String toString() {
        return "[program " + this.commandListNode.toString() + "]";
    }
}