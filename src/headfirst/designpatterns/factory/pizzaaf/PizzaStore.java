package headfirst.designpatterns.factory.pizzaaf;

/**
 * 抽象工厂模式
 * 模式的扩展
	 抽象工厂模式的扩展有一定的“开闭原则”倾斜性：
	 当增加一个新的产品族时只需增加一个新的具体工厂，不需要修改原代码，满足开闭原则。
	 当产品族中需要增加一个新种类的产品时，则所有的工厂类都需要进行修改，不满足开闭原则。

 另一方面，当系统中只存在一个等级结构的产品时，抽象工厂模式将退化到工厂方法模式。

 *
 * 简单工厂模式：把类的创建统一放在一起（违背开闭原则，如果要新增产品，需要修改原有的工厂类）
 * 工厂方法模式：只能创建一种类型的产品(符合开闭原则，工厂生产的产品比较单一)
 * 抽象工厂模式:可以创建复杂对象的工厂，一个工厂能创建多种等级产品(可以创建多等级产品)
 */
public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
