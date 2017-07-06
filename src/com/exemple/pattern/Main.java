package com.exemple.pattern;

import com.exemple.pattern.decorator.Car;
import com.exemple.pattern.decorator.Door;
import com.exemple.pattern.decorator.Engine;
import com.exemple.pattern.decorator.Wheel;
/**
 * 
 * @author Anthony Paulin
 * @since 06/07/2017
 * @version 0.1
 * Make a car using the decorator design pattern
 *
 */
public class Main {

	public static void main(String[] args) {
		//Make a car
		Car car = new Car();
		
		//Add the engine
		car = new Engine(car);
		
		//Add 4 wheels
		for(int i=0;i<4;i++)
		{
			car = new Wheel(car);
		}
		
		//Add 5 doors
		for(int i=0;i<5;i++)
		{
			car = new Door(car);
		}
		
		//Show the car
		System.out.println(car);
	}
}
