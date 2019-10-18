package headfirst.designpatterns.factory.pizzas;

/**
 * 静态工厂模式
 * 存在的问题：当需要新增一个pizza产品时，需要修改原有的代码（违背了开闭原则）
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
