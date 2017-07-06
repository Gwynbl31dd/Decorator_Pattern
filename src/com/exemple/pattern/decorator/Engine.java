package com.exemple.pattern.decorator;

public class Engine extends ComponentDecorator{
	
	public Engine(Car car) {
		super(car);
	}

	@Override
	public String toString() {
		return getCar() + " with an engine";
	}

}
