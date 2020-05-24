package seii;

public abstract class Ingredient implements HealthyFood{
    protected HealthyFood healthyFood;

    protected Ingredient( HealthyFood healthyFood ){
        this.healthyFood = healthyFood;
    }
}
