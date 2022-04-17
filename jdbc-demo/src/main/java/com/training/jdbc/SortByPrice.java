package com.training.jdbc;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
	
	    // Used for sorting in ascending order of
	    // price
	public int compare(Product p1, Product p2) {
			// TODO Auto-generated method stub
			if(p1.getPrice() > p2.getPrice()) {
				return 1;
			}
			else if(p1.getPrice() < p2.getPrice())
			{
				return -1;
		}
		else
		{
			return 0;
		}
		
		}
		
	}



