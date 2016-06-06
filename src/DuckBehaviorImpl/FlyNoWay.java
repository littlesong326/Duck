package DuckBehaviorImpl;

import IDuckBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior  {

	@Override
	public void fly() throws Exception {
		System.out.println("我是一只不会飞的鸭子");
		
	}

}
