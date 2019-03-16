package week_2.command.commands;

public interface ICommand {

    public abstract void execute();

    public abstract void unexecute();

    public abstract boolean isReversible();
}
