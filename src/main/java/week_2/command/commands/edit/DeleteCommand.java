package week_2.command.commands.edit;

import week_2.command.Document;

public class DeleteCommand extends AbstractEditCommand {

    private String word;

    public DeleteCommand(Document document) {
        super(document);
    }

    @Override
    public void execute() {
        super.execute();
        this.word = this.document.getVictimWord();
        this.document.deleteWord();
    }

    @Override
    public void unexecute() {
        this.document.setCursorPosition(this.cursorPosition);
        this.document.insertWord(this.word);
    }
}
