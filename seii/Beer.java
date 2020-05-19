package seii;

class Beer implements Drink{

    private final static String DRINK_NAME = "Beer";
    private final static Float COST = 2500F;


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