package seii;

import java.util.Set;

public abstract class RestaurantAbstractFactory {

    protected AdvertisingStrategy<Promo> promos;
    protected Subject<Set<Promo>> subject;

    protected RestaurantAbstractFactory(){
        PromoStrategy promoStrategy = new PromoStrategy();
        promos = promoStrategy;
        subject = promoStrategy;
        promos.addStrategy(new Bonus());
        promos.addStrategy(new Cumulative());
        promos.addStrategy(new Discount());
    }

    public Subject<Set<Promo>> getSubject() {
        return subject;
    }

    abstract public FastFood getFastfood( String type );
    abstract public Drink getDrink( String type );
    abstract public HealthyFood getHealthyFood( String type );

    public RestaurantOrder initOrder( ){
        RestaurantOrder order = new SimpleOrder( );
        return order;
    }

    public void applyPromos( int orderId ){
    }

}