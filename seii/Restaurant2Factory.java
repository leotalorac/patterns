package seii;

class Restaurant2Factory extends RestaurantAbstractFactory{

    public Restaurant2Factory( ){
        super( );
        promos.addStrategy( new Bonus( ) );
        promos.addStrategy( new Cumulative( ) );
    }

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

    @Override
    public HealthyFood getHealthyFood(String type) {
        return null;
    }

}