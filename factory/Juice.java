package factory;

class Juice implements Drink{

    private final static String DRINK_NAME = "Juice";

    @Override
    public void pour( ){ }

    @Override
    public String toString( ){
        return DRINK_NAME;
    }

}
