package seii;

import java.util.HashSet;
import java.util.Set;


public class PromoStrategy implements AdvertisingStrategy<Promo>, Subject<Set<Promo>>{
    private Set<Observer<Set<Promo>>> observers;
    private Set<Promo> promos;

    public PromoStrategy(){
        observers = new HashSet<Observer<Set<Promo>>>();
        promos = new HashSet<Promo>();
    }

    @Override
    public void addStrategy(Promo promo) {
        promos.add(promo);
        notifyObservers();
    }
    
    
    @Override
    public void removeStrategy(Promo promo) {
        promos.remove(promo);
        notifyObservers();
    }

    @Override
    public void executeStrategy(RestaurantOrder order) {
        for(Promo promo:promos){
            promo.applyPromo(order);
        }
    }

    @Override
    public Promo getPromos(Promo strategy) {
        return null;
    }

    @Override
    public void registerObserver( Observer<Set<Promo>> observer){
        observers.add(observer);
    }
    
    @Override
    public void removeObserver( Observer<Set<Promo>> observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer<Set<Promo>> observer : observers)
            observer.update(promos);
    }
}