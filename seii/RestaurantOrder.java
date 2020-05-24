package seii;

import java.util.List;

public interface RestaurantOrder{

    int getId( );

    void addItem( FastFood fastFood );
    void addItem( Drink drink );
    void addItem(HealthyFood healthyFood);
    List<Drink> getDrinks( );
    List<FastFood> getFastFoods( );
    List<HealthyFood> getHealthyFood( );

    void addPromo( Promo promo );

    Float getGrossCost( );
    Float getNetCost( );
    void setNetCost( Float finalCost );

}