package headfirst.designpatterns.adapter.ducks;

/**
 * 适配器模式：（将一个接口转换成另外一个接口，接口转换）
 * 目的：让客户从接口实现解耦，接口需要实现其他接口的功能时，不需要修改接口，而是使用适配器进行转化
 * 方法：利用适配器类绑定客户和接口
 * 利用适配器来执行第三方给的类
 * Turkey接口是现有系统提供的，在接入新的对象MallardDuck时，需要MallardDuck提供一个可以接入Turkey的适配器DuckAdpter,
 * 这样就能在现有的系统里跑MallardDuck类的代码了
 */
public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			//利用适配器执行Turkey接口的方法
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
