package DuckModel;

import DuckBase.Duck;
import DuckBehaviorImpl.FlyNoWay;
import DuckBehaviorImpl.Squeak;

public class RubberDuck extends Duck{
  public RubberDuck(){
	  setFlyBehavior(new FlyNoWay());
	  setQuackBehavior(new Squeak());
  }
  public void display() {
		System.out.println("我是 RubberDuck。");
	}
}
