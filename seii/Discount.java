package seii;

/**
 * The Order (or product) has X% discount
 */
class Discount implements Promo{

    private final static Float DISCOUNT = 0.3F; // percentage

    @Override
    public void applyPromo( RestaurantOrder order ){
        order.setNetCost( order.getGrossCost( ) * (1 - DISCOUNT) );
    }

}