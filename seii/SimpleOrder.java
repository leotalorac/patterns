package seii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SimpleOrder implements RestaurantOrder{

    private final List<FastFood> fastFoods;
    private final List<Drink> drinks;
    private final List<HealthyFood> healthyFoods;
    private final List<Promo> promos;

    private Float finalCost;
    private boolean isNetCostCalculated;
    private boolean werePromosApplied;


    public SimpleOrder( ){
        fastFoods = new LinkedList<>( );
        drinks = new LinkedList<>( );
        healthyFoods = new LinkedList<>();
        promos = new ArrayList<>( );
        isNetCostCalculated = false;
        werePromosApplied = false;
    }


    @Override
    public int getId( ){
        return hashCode( );
    }

    @Override
    public void addItem( FastFood fastFood ){
        fastFoods.add( fastFood );
    }

    @Override
    public void addItem( Drink drink ){
        drinks.add( drink );
    }

    @Override
    public void addItem(HealthyFood healthyFood) {
        healthyFoods.add(healthyFood);
    }

    @Override
    public List<Drink> getDrinks( ){
        return drinks;
    }

    @Override
    public List<FastFood> getFastFoods( ){
        return fastFoods;
    }

    @Override
    public List<HealthyFood> getHealthyFood() {
        return healthyFoods;
    }

    @Override
    public void addPromo( Promo promo ){
        promos.add( promo );
        werePromosApplied = false;
    }

    @Override
    public Float getGrossCost( ){
        Float grossCost = 0F;
        for( FastFood fastFood : fastFoods ){
            grossCost += fastFood.getCost( );
        }
        for( Drink drink : drinks ){
            grossCost += drink.getCost( );
        }
        for( HealthyFood healthyFood : healthyFoods ){
            grossCost += healthyFood.getCost( );
        }
        return grossCost;
    }

    /**
     * For SimpleOrder implementation Net Cost only can apply one promo.
     * @return The Net cost that apply the last promo added to list
     */
    @Override
    public Float getNetCost( ){
        if( !werePromosApplied ){
            applyPromos( );
        }
        return isNetCostCalculated ? finalCost : getGrossCost( );
    }

    @Override
    public void setNetCost( Float finalCost ){
        isNetCostCalculated = true;
        this.finalCost = finalCost;
    }

    @Override
    public String toString( ){
        if( !werePromosApplied ){
            applyPromos( );
        }
        StringBuilder builder = new StringBuilder( "********************" );
        builder.append( "\nOrden número " ).append( getId( ) )
                .append( "\n  Comidas Rápidas: " ).append( fastFoods )
                .append( "\n  Comidas Saludables: " ).append( healthyFoods )
                .append( "\n  Bebidas: " ).append( drinks )
                .append( "\n  Costo Neto: " ).append( getNetCost( ) )
                .append( "\n  Costo Bruto: " ).append( getGrossCost( ) );
        return builder.toString( );
    }

    private void applyPromos( ){
        for( Promo promo : promos ){
            promo.applyPromo( this );
        }
        werePromosApplied = true;
    }
}