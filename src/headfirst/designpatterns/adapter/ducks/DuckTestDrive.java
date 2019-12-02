package headfirst.designpatterns.adapter.ducks;

import headfirst.designpatterns.adapter.ducks.challenge.Drone;
import headfirst.designpatterns.adapter.ducks.challenge.DroneAdapter;
import headfirst.designpatterns.adapter.ducks.challenge.SuperDrone;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		// Challenge
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);
		testDuck(droneAdapter);
	}

	/**
	 * 可以传入Duck对象，或者DuckAdapter对象
	 *  此接口只支持Duck对象，而Turkey类型的类无法使用，使用DuckAdapter包装Turkey，进行适配
	 * @param duck
	 */
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
