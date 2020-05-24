package seii;

public interface AdvertisingStrategy<T>{
    void addStrategy( T strategy);
    void removeStrategy(T strategy);
    void executeStrategy( RestaurantOrder order);
    Promo getPromos(T strategy);
}