package seii;

public interface FastFood{
    void prepareIngredients( );
    void cook( );
    void serve( );
    Float getCost( );
    String getDescription( );

    default Builder builder( ){
        return new Builder( this );
    }

    class Builder{

        FastFood fastFood;

        protected Builder( FastFood fastFood ){
            this.fastFood = fastFood;
        }

        public Builder addBacon( ){
            fastFood = new Bacon( fastFood );
            return this;
        }

        public Builder addCorn( ){
            fastFood = new Corn( fastFood );
            return this;
        }

        public Builder addMushroom( ){
            fastFood = new Mushroom( fastFood );
            return this;
        }

        public FastFood build( ){
            return fastFood;
        }
    }

}