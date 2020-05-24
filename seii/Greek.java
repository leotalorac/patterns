package seii;

public class Greek extends  AdditionalDecorator{
    private final static Float COST = 15500F;
    private final static String DESCRIPTION = " with olives feta cheese and cherry tomato";

    protected Greek(FastFood fastFood) {
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
