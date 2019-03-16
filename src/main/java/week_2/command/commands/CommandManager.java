package week_2.command.commands;

import java.util.Stack;

public class CommandManager {

    private static CommandManager commandManager;
    private Stack<ICommand> undoStack;
    private Stack<ICommand> redoStack;

    private CommandManager() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public static CommandManager getInstance() {
        if (commandManager == null) {
            commandManager = new CommandManager();
        }

        return commandManager;
    }

    public void invokeCommand(ICommand command) {
        if (command.isReversible()) {
            this.undoStack.push(command);
        }
        command.execute();
    }

    public void undo() {
        if (!this.undoStack.empty()) {
            ICommand command = this.undoStack.pop();
            command.unexecute();
            this.redoStack.push(command);
        }
    }

    public void redo() {
        if (!this.redoStack.empty()) {
            ICommand command = this.redoStack.pop();
            command.execute();
            this.undoStack.push(command);
        }
    }
}
