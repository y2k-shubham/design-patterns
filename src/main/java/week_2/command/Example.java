package week_2.command;

import week_2.command.commands.CommandManager;
import week_2.command.commands.SaveCommand;
import week_2.command.commands.cursor.CursorLeftCommand;
import week_2.command.commands.cursor.CursorRightCommand;
import week_2.command.commands.edit.DeleteCommand;
import week_2.command.commands.edit.InsertCommand;

public class Example {

    public static void main(String[] args) {
        Document document = new Document();
        CommandManager commandManager = CommandManager.getInstance();

        document.preview();
        commandManager.invokeCommand(new InsertCommand(document, "my"));
        document.preview();
        commandManager.invokeCommand(new InsertCommand(document, "mame"));
        document.preview();
        commandManager.invokeCommand(new DeleteCommand(document));
        document.preview();
        commandManager.invokeCommand(new InsertCommand(document, "name"));
        document.preview();
        commandManager.invokeCommand(new InsertCommand(document, "iss"));
        document.preview();
        //
        commandManager.undo();
        document.preview();
        commandManager.invokeCommand(new InsertCommand(document, "Khan"));
        document.preview();
        commandManager.undo();
        document.preview();
        commandManager.redo();
        document.preview();
        commandManager.invokeCommand(new CursorLeftCommand(document));
        document.preview();
        //
        commandManager.invokeCommand(new InsertCommand(document, "is"));
        document.preview();
        commandManager.invokeCommand(new CursorRightCommand(document));
        document.preview();
        //
        commandManager.invokeCommand(new SaveCommand());
    }
}
