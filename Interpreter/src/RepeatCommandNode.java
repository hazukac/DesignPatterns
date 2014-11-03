// <repeat command> ::= repeat <number> <command list>

public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        this.number = context.currentNumber();
        context.nextToken();
        this.commandListNode = new CommandListNode();
        this.commandListNode.parse(context);
    }
    public String toString() {
        return "[repeat " + this.number + "x" + this.commandListNode.toString() + "]";
    }
}