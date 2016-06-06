package test;

import DuckBase.Duck;
import DuckBehaviorImpl.Squeak;
import DuckModel.MallardDuck;
import DuckModel.RedheadDuck;
import DuckModel.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) throws Exception {
		Duck mallard = new MallardDuck();
		System.out.println("----------start testing MallardDuck-------");
		mallard.performFly();
	    mallard.performQuack();
	    mallard.swim();
	    mallard.display();
	    mallard.setQuackBehavior(new Squeak());
	    System.out.println("mallardDuck更改叫声为吱吱吱：");
	    mallard.performQuack();
	    System.out.println("----------end testing MallardDuck-------");
		
	    Duck redhead = new RedheadDuck();
		System.out.println("----------start testing RedheadDuck-------");
		redhead.performFly();
		redhead.performQuack();
		redhead.display();
		System.out.println("----------end testing RedheadDuck-------");

	    Duck rubber = new RubberDuck();
		System.out.println("----------start testing RubberDuck-------");
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();
		rubber.display();
		System.out.println("----------end testing RubberDuck-------");
	}

}
