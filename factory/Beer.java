package factory;

class Beer implements Drink{

    private final static String DRINK_NAME = "Beer";


    @Override
    public void pour( ){ }

    @Override
    public String toString( ){
        return DRINK_NAME;
    }

}