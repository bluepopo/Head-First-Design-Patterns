package decorator;

public class TestMain {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();


        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);


        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
