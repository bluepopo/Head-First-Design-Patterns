package decorator;

//浓缩咖啡
public class Espresso extends Beverage{

    public Espresso() {
        //实例化时自动设置当前对象得描述，注意：description实例变量继承自Beverage
        this.description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
