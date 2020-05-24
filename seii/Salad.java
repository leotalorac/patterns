package seii;

public class Salad implements HealthyFood {
    private final static Float COST = 100F;
    private final static String DESCRIPTION = "Salad";
    private static Float SALT = 0F;


    @Override
    public void addSalt(float quantity) {
        SALT +=quantity;
    }

    @Override
    public Float getCost() {
        return COST;
    }

    @Override
    public String getIngredients() {
        return DESCRIPTION;
    }
    public Float getSalt(){
        return SALT;
    }

    @Override
    public String toString( ){
        return this.getIngredients() +" and with "+ this.getSalt() +"g of salt";
    }

}
