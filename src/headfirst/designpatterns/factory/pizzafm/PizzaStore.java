package headfirst.designpatterns.factory.pizzafm;

/**
 * 工厂方法模式
 *
 */
public abstract class PizzaStore {


	/**
	 * 抽象工厂方法
	 * 工厂方法交给子类去实现，客户代码和具体类型能够解耦。客户代码仅仅依赖PizzaStore类型，而不依赖具体的子类类型
	 * @param item
	 * @return
	 */
	abstract Pizza createPizza(String item);
 
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
