package DuckBehaviorImpl;

import IDuckBehavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() throws Exception {
		System.out.println("我是一只高配火箭的鸭子");

	}

}
