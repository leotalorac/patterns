package seii;

import java.util.Set;

public class CustomerPromoObserver implements Observer<Set<Promo>> {

    private Subject <Set<Promo>> subject;

    @Override
    public void update(Set<Promo> promos) {

    }

    @Override public int hashCode(){
        return 0;
    }
    
}