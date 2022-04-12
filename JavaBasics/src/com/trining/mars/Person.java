package com.trining.mars;

public class Person {
	//int height;
	//int weight;
	private int height;
	private int weight;
	public Person()
	{ //default constructor
		//System.out.println("Object created");
	}
	
	public Person(int height,int weight)
	{
		this.height=height;
		this.weight=weight;
	}
	public int getHeight()
	{
		return height;
	}

public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

public String getPersonInfo()
{
	return "person height" +this.height + "person weight" +this.weight; 
}
	
}
