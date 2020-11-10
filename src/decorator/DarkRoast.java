package decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        //实例化时自动设置当前对象得描述，注意：description实例变量继承自Beverage
        this.description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
