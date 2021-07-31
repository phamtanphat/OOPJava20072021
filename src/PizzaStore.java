public class PizzaStore {

    public void orderPizza(int type) {
        Pizza pizza = null;
        switch (type) {
            case 1:
                pizza = new CheesePizza();
                break;
            case 2:
                pizza = new PestoSaucePizza();
                break;
            case 3:
                pizza = new SeaFoodPizza();
                break;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}
