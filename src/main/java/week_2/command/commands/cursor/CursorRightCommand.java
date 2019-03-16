package week_2.command.commands.cursor;

import week_2.command.Document;

public class CursorRightCommand extends AbstractCursorCommand {

    public CursorRightCommand(Document document) {
        super(document);
    }

    @Override
    public void execute() {
        this.document.setCursorPosition(this.document.getCursorPosition() + 1);
    }
}
