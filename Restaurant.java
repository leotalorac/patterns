import factory.Drink;
import factory.FastFood;
import factory.RestaurantAbstractFactory;
import factory.RestaurantFactoryProducer;

public class Restaurant{

    private static FastFood hamburger;
    private static FastFood sandwich;
    private static FastFood hotDog;
    private static FastFood pizza;
    private static Drink soda;
    private static Drink juice;
    private static Drink beer;

    public static void main( String[] args ){
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurant1 =
                restaurantFactoryProducer.getRestaurantAbstractFactory( 1 );
        RestaurantAbstractFactory restaurant2 =
                restaurantFactoryProducer.getRestaurantAbstractFactory( 2 );

        System.out.println( "*** Restaurant 1 ***" );
        setFromRestaurant( restaurant1 );
        printInConsole( ); // Print "Hamburger Sandwich Hot Dog null Soda null null"

        System.out.println( "*** Restaurant 2 ***" );
        setFromRestaurant( restaurant2 );
        printInConsole( ); // Print "null null null Pizza null Juice beer"

    }

    private static void setFromRestaurant( RestaurantAbstractFactory abstractFactory ){
        hamburger = abstractFactory.getFastfood( "hamburger" );
        sandwich = abstractFactory.getFastfood( "sandwich" );
        hotDog = abstractFactory.getFastfood( "hot dog" );
        pizza  = abstractFactory.getFastfood( "pizza" );
        soda = abstractFactory.getDrink( "soda" );
        juice = abstractFactory.getDrink( "juice" );
        beer = abstractFactory.getDrink( "beer" );
    }

    private static void printInConsole( ){
        System.out.println( hamburger );
        System.out.println( sandwich );
        System.out.println( hotDog );
        System.out.println( pizza );
        System.out.println( soda );
        System.out.println( juice );
        System.out.println( beer );
    }

}