package factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    //披萨名
    String name;
    //面团类型
    String dough;
    //酱料
    String sauce;
    //一套佐料
    ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings : " );
        for (int i = 0; i < toppings.size();i++){
            System.out.println(" " + toppings.get(i));
        }
    }


    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }


    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
