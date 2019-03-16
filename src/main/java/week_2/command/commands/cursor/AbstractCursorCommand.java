package week_2.command.commands.cursor;

import week_2.command.Document;
import week_2.command.commands.ICommand;

public abstract class AbstractCursorCommand implements ICommand {

    protected Document document;

    public AbstractCursorCommand(Document document) {
        this.document = document;
    }

    @Override
    public void unexecute() {

    }

    @Override
    public boolean isReversible() {
        return false;
    }
}
