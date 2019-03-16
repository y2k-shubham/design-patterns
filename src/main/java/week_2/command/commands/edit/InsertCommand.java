package week_2.command.commands.edit;

import week_2.command.Document;

public class InsertCommand extends AbstractEditCommand {

    private String word;

    public InsertCommand(Document document, String word) {
        super(document);
        this.word = word;
    }

    @Override
    public void execute() {
        super.execute();
        this.document.insertWord(word);
    }

    @Override
    public void unexecute() {
        this.document.deleteWord();
    }
}
