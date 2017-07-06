package com.exemple.pattern.decorator;

public class Wheel extends ComponentDecorator{
	
	public Wheel(Car car) {
		super(car);
	}

	@Override
	public String toString(){
		return getCar() + " with a wheel";
	}
}
