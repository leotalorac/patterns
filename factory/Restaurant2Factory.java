package factory;

class Restaurant2Factory extends RestaurantAbstractFactory{

    @Override
    public FastFood getFastfood( String type ){
        switch( type ){
            case "pizza": return new Pizza( );
            default: return null;
        }
    }

    @Override
    public Drink getDrink( String type ){
        switch( type ){
            case "beer": return new Beer( );
            case "juice": return new Juice( );
            default: return null;
        }
    }

}