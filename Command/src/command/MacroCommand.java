package command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<Command>();
    public void execute() {
        Iterator itr = commands.iterator();
        while (itr.hasNext()) {
            ((Command)itr.next()).execute();
        }
    }
    public void append(Command command) {
        if (command != this) {
            this.commands.push(command);
        }
    }
    public void undo() {
        if (! this.commands.empty()) {
            this.commands.pop();
        }
    }
    public void clear() {
        this.commands.clear();
    }
}