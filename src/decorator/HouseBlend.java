package decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        //实例化时自动设置当前对象得描述，注意：description实例变量继承自Beverage
        this.description = "综合咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
