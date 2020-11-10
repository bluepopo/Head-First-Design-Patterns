package factory.store;

import factory.pizza.Pizza;

public abstract class PizzaStore {


    //披萨得加工流程都是不变得
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        //依赖工厂方法创建具体类，并制造出实际得披萨
        pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //创建何种披萨需要子类去实现
     abstract Pizza createPizza(String item);


}
