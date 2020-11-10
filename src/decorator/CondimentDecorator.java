package decorator;


//首先，必须让Condiment Decorator能够取代Beverage，所以将CondimentDecorator扩展自 Beverage 类。
public abstract class CondimentDecorator extends Beverage {

    //所有的调料装饰者都必须重写 getDescription()方法。稍后我们会解释为什么
    public abstract String getDescription();
}
