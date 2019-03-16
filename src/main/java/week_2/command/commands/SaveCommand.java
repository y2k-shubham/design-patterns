package week_2.command.commands;

public class SaveCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("Saving document");
    }

    @Override
    public void unexecute() {

    }

    @Override
    public boolean isReversible() {
        return false;
    }
}
