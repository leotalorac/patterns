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

        System.out.println( combo1.getDescription( ) );
        System.out.println( combo1.getCost( ) );

    }

}