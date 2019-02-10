package week_1.composite.specs;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompositeStructure extends AbstractStucture {

    private List<IStructure> structures;

    public AbstractCompositeStructure(String name) {
        super(name);
        this.structures = new ArrayList<>();
    }

    public int addStructure(IStructure structure) {
        this.structures.add(structure);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int pos) {
        if (this.structures.size() <= pos) {
            return this.structures.get(pos - 1);
        } else {
            throw new ArrayIndexOutOfBoundsException("Num-structures is only " + this.structures.size());
        }
    }

    @Override
    public void location() {
        super.location();
        System.out.println("It has following stuctures:-");
        for (IStructure structure : this.structures) {
            System.out.println(structure.getName());
        }
    }

}
