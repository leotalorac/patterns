package factory;

class Soda implements Drink{

    private final static String DRINK_NAME = "Soda";

    @Override
    public void pour( ){ }

    @Override
    public String toString( ){
        return DRINK_NAME;
    }

}