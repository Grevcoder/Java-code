package com.trining.mars;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int luckyNumber=8;
        System.out.println("Enter lucky number");
        int enteredNumber=scanner.nextInt();
        int count=0;

        while(luckyNumber!=enteredNumber) 
        {
        	System.out.println("Better luck next time");
        	count++;
        	 enteredNumber=scanner.nextInt();
        }
               
        	System.out.println("You Guess it right");
        	System.out.println("you take these attempt" + count );
        	
               
        
        	}
	

}
