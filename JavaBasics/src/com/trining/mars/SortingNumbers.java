package com.trining.mars;
import java.util.Scanner;

public class SortingNumbers {
	public static void main(String[] args) {
		//sorting numbers in ascending order
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
        int count=scanner.nextInt();
		int[] numbers=new int[count];
		System.out.println("Enter" + count + " numbers");
		for(int i=0;i<count;i++)
		{
			numbers[i]=scanner.nextInt();
			
		}
		
		System.out.println("Ascending order");
		
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            {
                if (numbers[i] > numbers[j]) //2>7,7>5
                {
                    int storingNumber = numbers[i];//7=7
                    numbers[i] = numbers[j];//now number storing 5 and j incremented by 1
                    numbers[j] = storingNumber;
                    
                }
               
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers[count-1]);
    }
	}


