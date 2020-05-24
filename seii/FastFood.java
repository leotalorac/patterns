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

        public Builder addPrefab(String type){
            switch (type){
                case "hawaiian":
                    fastFood = new Hawaiian(fastFood);
                    break;
                case "greek":
                    fastFood = new Greek(fastFood);
                    break;
                case "vegetarian":
                    fastFood = new Vegetarian(fastFood);
                    break;
                case "napolitan":
                    fastFood = new Napolitan(fastFood);
                    break;
                default:
                    break;
            }
            return this;
        }

        public FastFood build( ){
            return fastFood;
        }
    }

}