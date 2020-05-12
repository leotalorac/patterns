package factory;

class Sandwich implements FastFood{

    private final static String FAST_FOOD_NAME = "Sandwich";

    @Override
    public void prepareIngredients( ){ }

    @Override
    public void cook( ){ }

    @Override
    public void serve( ){ }

    @Override
    public String toString( ){
        return FAST_FOOD_NAME;
    }

}