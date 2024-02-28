package abstractFactory;

import abstractFactory.dishes.Borsch;
import abstractFactory.dishes.Solyanka;
import abstractFactory.dishes.dish;

public class SoupFactory extends TypeDishFactory{
    @Override
    public dish getDish(String type) {
        if("Borsch".equalsIgnoreCase(type)){
            return new Borsch();
        } else{
            return new Solyanka();
        }
    }
}
