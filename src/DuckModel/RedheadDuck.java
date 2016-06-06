package DuckModel;

import DuckBase.Duck;
import DuckBehaviorImpl.FlyWithRocket;
import DuckBehaviorImpl.MuteQuack;


public class RedheadDuck extends Duck{
	public RedheadDuck(){
		setFlyBehavior(new FlyWithRocket());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("我是 RedheadDuck。");
	}
}
