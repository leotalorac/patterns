package seii;

public class Napolitan extends AdditionalDecorator{
    private final static Float COST = 14600F;
    private final static String DESCRIPTION = " with tomato and cheese";
    protected Napolitan(FastFood fastFood) {
        super(fastFood);
    }

    @Override
    public void prepareIngredients() {

    }

    @Override
    public void cook() {

    }

    @Override
    public void serve() {

    }

    @Override
    public Float getCost() {
        return this.fastFood.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return this.fastFood.getDescription() + DESCRIPTION;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
