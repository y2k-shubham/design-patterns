package week_1.composite.specs;

public abstract class AbstractStucture implements IStructure {

    private String name;

    public AbstractStucture(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("Entering " + getName());
    }

    @Override
    public void exit() {
        System.out.println("Exiting  " + getName());
    }

    @Override
    public void location() {
        System.out.println("Type: " + getType().toString());
        System.out.println("Name: " + getName());
    }

    public abstract StructureType getType();

    @Override
    public String getName() {
        return name;
    }

    public boolean isLeaf() {
        switch (getType()) {
            case ROOM:
                return true;
            default:
                return false;
        }
    }
}
