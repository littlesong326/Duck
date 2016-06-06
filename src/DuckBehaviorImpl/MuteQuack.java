package DuckBehaviorImpl;

import IDuckBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() throws Exception {
		System.out.println("我就静静不说话..");

	}

}
