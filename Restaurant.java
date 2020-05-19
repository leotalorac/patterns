import seii.*;

public class Restaurant{

    public static void main( String[] args ){
        RestaurantAbstractFactory restaurant1 =
                new RestaurantFactoryProducer( ).getRestaurantAbstractFactory( 1 );

        FastFood hamburger = restaurant1.getFastfood( "hamburger" );

        FastFood.Builder builder = hamburger.builder( );
        FastFood combo1 = builder
                .addCorn( )
                .addBacon( )
                .addMushroom( )
                .build( );

        RestaurantOrder order1 = restaurant1.initOrder( );

        order1.addItem( combo1 );
        order1.addItem( restaurant1.getDrink( "soda" ) );
        order1.addItem( restaurant1.getFastfood( "hot dog" ) );
        System.out.println( order1 );

        restaurant1.applyPromos( order1.getId( ) );

        System.out.println( order1 );

        RestaurantAbstractFactory restaurant2 =
                new RestaurantFactoryProducer( ).getRestaurantAbstractFactory( 2 );

        FastFood baconPizza = restaurant2.getFastfood( "pizza" ).builder( ).addBacon( ).addCorn( ).build( );
        FastFood vegetarianPizza = restaurant2.getFastfood( "pizza" ).builder( ).addCorn( ).addMushroom( ).build( );

        RestaurantOrder order2 = restaurant2.initOrder( );

        order2.addItem( baconPizza );
        order2.addItem( vegetarianPizza );
        System.out.println( order2 );

        restaurant2.applyPromos( order2.getId( ) );
        System.out.println( order2 );
    }

}