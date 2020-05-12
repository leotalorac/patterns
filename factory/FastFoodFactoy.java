package factory;

class FastFoodFactoy{

    public FastFood getFastfood( String type ){
        switch( type ){
            case "hamburger": return new Hamburger( );
            case "sandwich": return new Sandwich( );
            case "hot dog": return new HotDog( );
            case "pizza": return new Pizza( );
            default: return null;
        }
    }

}
