package DuckBehaviorImpl;

import IDuckBehavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() throws Exception {
		
     System.out.println("呱呱呱");
	}

}
