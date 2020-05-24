package seii;

public abstract class Sauce implements HealthyFood{

    protected HealthyFood healthyFood;

    protected Sauce( HealthyFood healthyFood ){
        this.healthyFood = healthyFood;
    }
}
