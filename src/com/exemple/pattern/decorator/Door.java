package com.exemple.pattern.decorator;

public class Door extends ComponentDecorator{

	public Door(Car car) {
		super(car);
	}

	@Override
	public String toString() {
		return getCar() +" with a door";
	}

}
