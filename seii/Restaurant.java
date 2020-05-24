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

        RestaurantAbstractFactory restaurant2 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(2);

        FastFood baconPizza = restaurant2.getFastfood("pizza").builder().addBacon().addCorn().build();

        FastFood strangePizza = restaurant2.getFastfood("pizza").builder().addCorn().addMushroom().build();

        RestaurantOrder order2 = restaurant2.initOrder();

        order2.addItem(baconPizza);
        order2.addItem(strangePizza);
        System.out.println(order2);
        restaurant2.applyPromos(order2.getId());
        System.out.println(order2);

        RestaurantAbstractFactory restaurant3 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(3);

        HealthyFood salad = restaurant3.getHealthyFood("salad").builder().addIngredient("tomato").mixIngredients();
        salad.addSalt(45);
        HealthyFood saladOnly = restaurant3.getHealthyFood("salad").builder().addSauce("soy").addIngredient("tomato").mixIngredients();
        RestaurantOrder order3 = restaurant3.initOrder();
        order3.addItem(saladOnly);
        order3.addItem(salad);
        System.out.println(order3);

        FastFood hawaiianPizza =  restaurant2.getFastfood("pizza").builder().addPrefab("hawaiian").build();
        FastFood vegetarianPizza =  restaurant2.getFastfood("pizza").builder().addPrefab("vegetarian").build();
        FastFood napolitanPizza =  restaurant2.getFastfood("pizza").builder().addPrefab("napolitan").build();
        FastFood greekPizza =  restaurant2.getFastfood("pizza").builder().addPrefab("greek").build();

        RestaurantOrder order4 = restaurant2.initOrder();
        order4.addItem(hawaiianPizza);
        order4.addItem(vegetarianPizza);
        order4.addItem(napolitanPizza);
        order4.addItem(greekPizza);
        System.out.println(order4);


    }

}