package com.trining.mars;

public class car extends Vehicle {
	static int noOfWheels;
	
	public void getValues()
	{
		breakType="Disc";
		speed=150;
		color="Blue";
		System.out.println("Color" + color +"Speed" +speed);
		getTopSpeed();
	}

}
