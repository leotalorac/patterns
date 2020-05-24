package seii;

public class Soy extends Sauce{
    private final static Float COST = 800F;
    private final static String DESCRIPTION = " with soy";
    private static Float SALT = 12f;
    protected Soy(HealthyFood healthyFood) {
        super(healthyFood);
    }

    @Override
    public void addSalt(float quantity) {
        SALT +=quantity;
    }

    @Override
    public Float getCost( ){
        return this.healthyFood.getCost( ) + COST;
    }

    @Override
    public Float getSalt() {
        return this.healthyFood.getSalt() + SALT;
    }

    @Override
    public String getIngredients( ){
        return this.healthyFood.getIngredients( ) + DESCRIPTION;
    }
    @Override
    public String toString( ){
        return this.getIngredients() +" and with "+ this.getSalt() +"g of salt";
    }
}
