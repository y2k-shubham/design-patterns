package week_2.command.commands.edit;

import week_2.command.Document;
import week_2.command.commands.ICommand;

public abstract class AbstractEditCommand implements ICommand {

    protected Document document;
    protected Integer cursorPosition;

    public AbstractEditCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.cursorPosition = this.document.getCursorPosition();
    }

    @Override
    public boolean isReversible() {
        return true;
    }
}
