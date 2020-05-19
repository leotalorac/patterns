package seii;

class Juice implements Drink{

    private final static String DRINK_NAME = "Juice";
    private final static Float COST = 1800F;

    @Override
    public void pour( ){ }

    @Override
    public Float getCost( ){
        return COST;
    }

    @Override
    public String toString( ){
        return DRINK_NAME;
    }

}
