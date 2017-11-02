package in.co.madhur.factory.ingredients;

import in.co.madhur.factory.Pizza;

public abstract class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    void prepare() {
        System.out.println("Preparing ");
//        dough = ingredientFactory.createDough();
//        sauce = ingredientFactory.createSauce();
//        cheese = ingredientFactory.createCheese();
    }
}
