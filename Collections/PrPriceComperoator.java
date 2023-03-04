package com.training;

import java.util.Comparator;

public class PrPriceComperoator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price == o2.price) {
			return 0;
		}else if(o1.price>o2.price){
			return 1;
		}
			
		return -1;
		
		
	}

	
}