package seii;

public class RestaurantFactoryProducer{

    public RestaurantAbstractFactory getRestaurantAbstractFactory( int numRestaurant ){
        switch( numRestaurant ){
            case 1: return new Restaurant1Factory( );
            case 2: return new Restaurant2Factory( );
            case 3: return new Restaurant3Factory( );
            default: return null;
        }
    }

}