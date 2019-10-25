package headfirst.designpatterns.adapter.ducks;

/**
 * 绑定Duck接口和客户类Turkey
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;//客户类(火鸡)
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
