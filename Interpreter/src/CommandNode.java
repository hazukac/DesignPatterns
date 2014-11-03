// <command> ::= <repeat command> | <primitive command>

public class CommandNode extends Node {
    private Node node;
    public void parse(Context context) throws ParseException {
        if (context.currentToken() == "repeat") {
            this.node = new RepeatCommandNode();
            this.node.parse(context);
        } else {
            this.node = new PrimitiveCommandNode();
            this.node.parse(context);
        }
    }
    public String toString() {
        return this.node.toString();
    }
}