package seii;

class Soda implements Drink{

    private final static String DRINK_NAME = "Soda";
    private final static Float COST = 2000F;

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