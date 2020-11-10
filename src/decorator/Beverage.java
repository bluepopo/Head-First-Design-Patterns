package decorator;


public abstract class Beverage {
    String description = "这是 Component 抽象类";


    public String getDescription() {
        return description;
    }


    public abstract  double cost();
}
