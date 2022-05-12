package com.chainsys.classmethods;

public class carTestt {
	public static void testar() {
		Car firstCar = new Car("TN 10A 001");
		firstCar.setColor("Red");
		firstCar.setFuel("petrol");
		firstCar.setYearOfPurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfPurchase());
		
	}
}
