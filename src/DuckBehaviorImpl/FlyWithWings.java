package DuckBehaviorImpl;

import IDuckBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() throws Exception {
		System.out.println("我是一只噗嗤噗嗤拍打翅膀的鸭子");

	}

}
