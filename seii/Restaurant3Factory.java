package seii;

public class Restaurant3Factory extends RestaurantAbstractFactory{
    @Override
    public FastFood getFastfood(String type) {
        return null;
    }

    @Override
    public Drink getDrink(String type) {
        return null;
    }

    @Override
    public HealthyFood getHealthyFood(String type) {
        switch (type) {
            case "salad":
                return new Salad();
            default:
                return null;
        }
    }
}
