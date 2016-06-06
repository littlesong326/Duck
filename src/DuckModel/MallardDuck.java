package DuckModel;

import DuckBase.Duck;
import DuckBehaviorImpl.FlyWithWings;
import DuckBehaviorImpl.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	public void display() {
		System.out.println("我是 MallarDuck。");
	}

}
