package seii;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class RestaurantAbstractFactory {

    protected AdvertisingStrategy<Promo> promos;
    protected Subject<Set<Promo>> subject;
    protected Map<Integer,RestaurantOrder> orders;

    protected RestaurantAbstractFactory(){
        PromoStrategy promoStrategy = new PromoStrategy();
        promos = promoStrategy;
        subject = promoStrategy;
        orders = new HashMap<>();
    }

    public Subject<Set<Promo>> getSubject() {
        return subject;
    }

    public void registerObserver(Observer<Set<Promo>> observer){
        subject.registerObserver(observer);
    }

    abstract public FastFood getFastfood( String type );
    abstract public Drink getDrink( String type );
    abstract public HealthyFood getHealthyFood( String type );

    public RestaurantOrder initOrder( ){
        RestaurantOrder order = new SimpleOrder( );
        orders.put(order.getId(),order);
        return order;
    }

    public void applyPromos( int orderId ){
        RestaurantOrder o = this.orders.get(orderId);
        promos.executeStrategy(o);
    }
    public void addStrategy(String type){
        switch (type) {
            case "bonus":
                promos.addStrategy(new Bonus());
                break;
            case "cumulative":
                promos.addStrategy(new Cumulative());
                break;
            case "discount":
                promos.addStrategy(new Discount());
                break;
        }
    }

}