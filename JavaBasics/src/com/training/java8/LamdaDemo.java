package com.training.java8;

import java.util.function.Function;

public class LamdaDemo {

	public static void main(String[] args) {
		
	//	MyFuncInterface method=() -> System.out.println("Lamda expression");
			//MyFuncInterface method=(a) -> {return(5* a);};
		Function method=(a) -> {int b=5+(int)a; return b;};


		//int result= method.getValue(5);
		

	}

}
