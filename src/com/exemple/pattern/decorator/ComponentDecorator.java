package com.exemple.pattern.decorator;
/**
 * 
 * @author Anthony Paulin
 * @version 0.1
 * @since 06/07/2017
 * Component Decorator of our car
 * You will need to redefine the toString method for the components
 */
public abstract class ComponentDecorator extends Car{
	
	private Car car;
	
	public ComponentDecorator(Car car){
		this.car = car;
	}
	
	public Car getCar(){
		return this.car;
	}
	
	public abstract String toString();
}
