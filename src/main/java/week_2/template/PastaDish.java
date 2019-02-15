package week_2.template;

public abstract class PastaDish {

    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        addSauce();
        addProtein();
        addGarnish();
        drainAndPlate();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void addPasta();

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }

    public abstract void addSauce();

    public abstract void addProtein();

    public abstract void addGarnish();

    private void drainAndPlate() {
        System.out.println("Drain and plate");
    }
}
