package seii;

public class Vegetarian extends AdditionalDecorator{
    private final static Float COST = 16900F;
    private final static String DESCRIPTION = " with spinach tomato and onions";
    protected Vegetarian(FastFood fastFood) {
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
