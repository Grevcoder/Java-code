package com.trining.mars;
import java.util.Scanner;
public class BasicsDemo {

	public static void main(String[] args) {
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age:");
        int age=scanner.nextInt();
		//int age=21;
		if(age <18) {
			System.out.println("not eligible to vote");
		}
			else
			{
				System.out.println("eligible to vote");
	
		}
		scanner.close();*/
		pattern();
		
	}

	/*private static void pattern()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		
	}*/
	private static void pattern()
	{
		int k=1;
	
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
		System.out.println();
		}
	
}
}