package seii;

import java.util.List;

public interface RestaurantOrder{

    int getId( );

    void addItem( FastFood fastFood );
    void addItem( Drink drink );
    List<Drink> getDrinks( );
    List<FastFood> getFastFoods( );

    void addPromo( Promo promo );

    Float getGrossCost( );
    Float getNetCost( );
    void setNetCost( Float finalCost );

}