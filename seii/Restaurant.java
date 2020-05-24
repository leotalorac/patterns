package seii;


public class Restaurant {

    public static void main(final String[] args) {
        RestaurantAbstractFactory restaurant1 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(1);
        FastFood hamburger = restaurant1.getFastfood("hamburger");
        FastFood.Builder builder = hamburger.builder();

        FastFood combo1 = builder
                .addCorn()
                .addBacon()
                .addMushroom()
                .build();

        RestaurantOrder order1 = restaurant1.initOrder();

        order1.addItem(combo1);
        order1.addItem(restaurant1.getDrink("soda"));
        order1.addItem(restaurant1.getFastfood("hot dog"));
        System.out.println(order1);

        restaurant1.applyPromos(order1.getId());
        System.out.println(order1);

        final RestaurantAbstractFactory restaurant2 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(2);

        final FastFood baconPizza = restaurant2.getFastfood("pizza").builder().addBacon().addCorn().build();

        final FastFood vegetarianPizza = restaurant2.getFastfood("pizza").builder().addCorn().addMushroom().build();

        final RestaurantOrder order2 = restaurant2.initOrder();

        order2.addItem(baconPizza);
        order2.addItem(vegetarianPizza);
        System.out.println(order2);
        restaurant2.applyPromos(order2.getId());
        System.out.println(order2);

        final RestaurantAbstractFactory restaurant3 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(3);

        final HealthyFood salad = restaurant3.getHealthyFood("salad").builder().addIngredient("tomato").mixIngredients();
        salad.addSalt(45);
        final HealthyFood saladOnly = restaurant3.getHealthyFood("salad").builder().addSauce("soy").addIngredient("tomato").mixIngredients();
        final RestaurantOrder order3 = restaurant3.initOrder();
        order3.addItem(saladOnly);
        order3.addItem(salad);
        System.out.println(order3);

    }

}