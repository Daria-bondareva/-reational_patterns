package abstractFactory;

import abstractFactory.dishes.HotDog;
import abstractFactory.dishes.Nuggets;
import abstractFactory.dishes.dish;

public class FastFoodFactory extends TypeDishFactory{
    @Override
    public dish getDish(String type) {
        if(" Hotdog".equalsIgnoreCase(type)){
            return new HotDog();
        } else{
            return new Nuggets();
        }
    }
}
