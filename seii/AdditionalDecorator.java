package seii;

abstract class AdditionalDecorator implements FastFood{

    protected FastFood fastFood;

    protected AdditionalDecorator( FastFood fastFood ){
        this.fastFood = fastFood;
    }

}