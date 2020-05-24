package seii;

import java.util.Objects;
import java.util.Set;

public class CustomerPromoObserver implements Observer<Set<Promo>> {

    private Subject <Set<Promo>> subject;

    @Override
    public void update(Set<Promo> promos) {
        System.out.println("Promotions");
        for(Promo promo : promos){
            System.out.println(promo);
        }
    }

    @Override public int hashCode(){
        return Objects.hash(subject);
    }
    
}