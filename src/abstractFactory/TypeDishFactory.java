package abstractFactory;
import abstractFactory.dishes.dish;

public abstract class  TypeDishFactory {
    public abstract dish getDish(String type);
}
