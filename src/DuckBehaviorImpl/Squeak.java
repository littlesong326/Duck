package DuckBehaviorImpl;

import IDuckBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() throws Exception {
		
		System.out.println("吱吱吱");
	}

}
