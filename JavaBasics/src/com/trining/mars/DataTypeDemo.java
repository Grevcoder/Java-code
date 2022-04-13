package com.trining.mars;
import java.util.Scanner;


public class DataTypeDemo {

	public static void main(String[] args) {
		//odd or even
		/*Scanner scanner=new Scanner(System.in);
		int[] number=new int[6];

		System.out.println("Enter 6 numbers");
		for(int i=0;i<6;i++)
		{
			number[i]=scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
			{
				System.out.println(number[i]+ "even");
			}
			else
			{
				System.out.println(number[i]+ "odd");
			}
		}
		
		// TODO Auto-generated method stub
	/*	String name="John";//string literal
		String firstName=new String("John");//creating object
		String secondName=new String("John");
		String myName="John"; // this point to name john
		//System.out.println(name.equals(myName));
		//System.out.println(name==myName);
		//System.out.println(firstName.equals(secondName));
		//System.out.println(firstName==secondName);
		int[] marks=new int[5];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=2*i+40;
			System.out.println(marks[i]);	
		}*/
		
		int[][] numbers=new int[3][];
		
		numbers[0]=new int[4];
		numbers[1]=new int[5];
		numbers[2]=new int[4];
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				numbers[i][j]=i*4+j;
			}
		}
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				System.out.print(numbers[i][j] + "");		
				}
			System.out.println();
		}
		
	}

}
