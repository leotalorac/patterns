package seii;

public class Corn extends AdditionalDecorator{

    private final static Float COST = 800F;
    private final static String DESCRIPTION = " with corn";

    public Corn( FastFood fastFood ){
        super( fastFood );
    }


    @Override
    public void prepareIngredients( ){ }

    @Override
    public void cook( ){ }

    @Override
    public void serve( ){ }

    @Override
    public Float getCost( ){
        return this.fastFood.getCost( ) + COST;
    }

    @Override
    public String getDescription( ){
        return this.fastFood.getDescription( ) + DESCRIPTION;
    }

}