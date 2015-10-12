package com.mageddo.tests;

public class Main {

	public static void main(String[] args) {
		WaterMachine waterMachine = new WaterMachine();
		CoffeeMachine coffeeMachine = new CoffeeMachine(waterMachine);
		System.out.println(coffeeMachine.doCoffee());

	}

}
