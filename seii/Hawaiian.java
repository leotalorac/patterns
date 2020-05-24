package seii;

public class Hawaiian extends AdditionalDecorator {
    private final static Float COST = 10000F;
    private final static String DESCRIPTION = " with ham and pineapple";

    protected Hawaiian(FastFood fastFood) {
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
