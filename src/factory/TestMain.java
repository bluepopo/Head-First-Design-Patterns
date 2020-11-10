package factory;

import factory.pizza.Pizza;
import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class TestMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza01 = pizzaStore.orderPizza("cheese");

        System.out.println("Jerry 得到一份披萨 : \n" + pizza01);


        PizzaStore pizzaStore02 = new ChicagoPizzaStore();
        Pizza pizza02 = pizzaStore02.orderPizza("cheese");
        System.out.println("Tom 得到一份披萨 : \n"+ pizza02);



    }
}
