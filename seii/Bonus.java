package seii;

/**
 * Example: Pay FastFood and the Drink is courtesy of the house
 */
class Bonus implements Promo{

    @Override
    public void applyPromo( RestaurantOrder order ){
        Float netCost = order.getGrossCost( );
        for( int i = 0; i < order.getFastFoods( ).size( ); i++ ){
            order.addItem( new Juice( ) );
        }
        order.setNetCost( netCost );
    }

}