package seii;

public interface HealthyFood {
    void addSalt(float quantity);
    Float getCost( );
    Float getSalt();
    String getIngredients( );
    default HealthyFood.Builder builder( ){
        return new HealthyFood.Builder( this );
    }

    class Builder{

        HealthyFood healthyFood;

        protected Builder( HealthyFood healthyFood ){
            this.healthyFood = healthyFood;
        }

        public HealthyFood.Builder addSauce(String sauce ){
            switch (sauce){
                case "soy":
                    healthyFood = new Soy( healthyFood );
                    break;
                default:
                    break;
            }
            return this;
        }

        public HealthyFood.Builder addIngredient(String ingredient ){
            switch (ingredient){
                case "tomato":
                    healthyFood = new Tomato(healthyFood);
                    break;
                default:
                    break;
            }
            return this;
        }

        public HealthyFood mixIngredients( ){
            return healthyFood;
        }
    }

}

