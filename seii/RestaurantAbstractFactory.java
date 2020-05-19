package seii;

import java.util.*;

public abstract class RestaurantAbstractFactory{

    private final Map<Integer, RestaurantOrder> orders;
    protected final Set<Promo> promos;

    protected RestaurantAbstractFactory( ){
        orders = new HashMap<>( );
        promos = new HashSet<>( );
    }

    abstract public FastFood getFastfood( String type );
    abstract public Drink getDrink( String type );

    public RestaurantOrder initOrder( ){
        RestaurantOrder order = new SimpleOrder( );
        orders.put( order.getId( ), order );
        return order;
    }

    public void pay( int orderId, Float cash ) throws Exception{
        RestaurantOrder order = orders.get( orderId );
        if( order.getNetCost( ) > cash ){
            throw new Exception( "No es posible ejecutar el pago" );
        }
        orders.remove( orderId );
    }

    public void applyPromos( int orderId ){
        RestaurantOrder order = orders.get( orderId );
        for( Promo promo : promos ){
            order.addPromo( promo );
        }
    }

}