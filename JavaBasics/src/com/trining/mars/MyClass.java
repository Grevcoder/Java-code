package com.trining.mars;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
byte number=89;
System.out.println("Byte Value" +number);
short shortValue=48;
int intValue=89;
byte newByte=(byte)intValue;//explicit type cast
int newInt=shortValue;//implicit type cast
int charValue='A';
System.out.println("Character Value" +charValue + newInt);
Person p1=new Person();

//p1.height=180;
p1.setHeight(200);
p1.setWeight(200);
System.out.println(p1.getPersonInfo());

Person p2=new Person(200,380);
System.out.println(p2.getPersonInfo());
	}

}
