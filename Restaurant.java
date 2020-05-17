import seii.*;

public class Restaurant{

    public static void main( String[] args ){
        RestaurantAbstractFactory restaurant1 =
                new RestaurantFactoryProducer( ).getRestaurantAbstractFactory( 1 );

        FastFood hamburger = restaurant1.getFastfood( "hamburger" );

        FastFood decorator = new Bacon( hamburger );
        decorator = new Corn( decorator );
        decorator = new Mushroom( decorator );

        System.out.println( decorator.getDescription( ) );
        System.out.println( decorator.getCost( ) );

    }

}