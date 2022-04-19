package com.trining.mars;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;


public class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		// create a csv data array
		String[] consumerDetails = {"653,Steve Jones,100", "654,Mike,457", "655,Kate,600", "656,Sophia,890"};
		String[] consumerList=null;
		HashSet<ConsumerDetails> hashset = new HashSet<>();

		// loop through array
		for(String consumer : consumerDetails)
		{
			// read item from array
			// split the item
			 consumerList = consumer.split(",");
				// create new hashset with values from the splitted array
 
			ConsumerDetails consumerNew = new ConsumerDetails(Integer.parseInt(consumerList[0]), consumerList[1], Integer.parseInt(consumerList[2]));
			hashset.add(consumerNew);	
			
			
		}
	
		System.out.println("Number of consumer Bill");
		int billNumber=scanner.nextInt();
		
		//int billNumber=3;
		int i = 0;
		double[] billAmount=new double[billNumber];

		for(ConsumerDetails cd:hashset)	
		{
		    if (i >= billNumber) break;
		    
		    if(cd.getUnits()>=50&&cd.getUnits()<=200)
		    {
		    	billAmount[i]=50;
		    }
		    else if(cd.getUnits()>200 && cd.getUnits()<=500)
		    {
		    	billAmount[i]=(float) (cd.getUnits()*1.25);
		    }
		    else if(cd.getUnits()>500 && cd.getUnits()<=1000)
		    {
		    	billAmount[i]=(float) (cd.getUnits()*1);
		    }
		    else if(cd.getUnits()>1000)
		    {
		    	billAmount[i]=(float) (cd.getUnits()*0.75);
		    }
		   
		    try
		    {
		    if(cd.getUnits()<50)
		    {
		    	throw new MyException("No of units can not be less than 50" );
		    }
		    }catch(MyException e)	
		    {
		    	System.out.println(e.getMessage());
		    }
		    
		    
		    i++;
		    

		}
		int j=0;
	
		for(ConsumerDetails cd:hashset)	
		{
		    if (j >=billNumber) break;
		    System.out.println(cd.getConsumerName() +": " + String.format("%.2f",  billAmount[j]));
		//    System.out.print(String.format("%.2f",  billAmount[j]));
		    j++;
		}
			 
	//	y1 = Float.valueOf(df.format(y1));

		
	}
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		