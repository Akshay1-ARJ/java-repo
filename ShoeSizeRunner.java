package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		

		int shoeSize1=10;
		int shoeSize2=11;
		int shoeSize3=12;
		int shoeSize4=13;
		int shoeSize5=14;
		int shoeSize6=15;
		int shoeSize7=8;
		int shoeSize8=9;
		int shoeSize9=7;
		int shoeSize10=6;
		int shoeSize11=5;
		int shoeSize12=4;
		int shoeSize13=3;
		int shoeSize14=2;
		int shoeSize15=1;
		
		Collection<Integer> shoeSize = new ArrayList<Integer>();
		
		shoeSize.add(10);
		shoeSize.add(11);
		shoeSize.add(12);
		shoeSize.add(13);
		shoeSize.add(14);
		shoeSize.add(15);
		shoeSize.add(1);
		shoeSize.add(2);
		shoeSize.add(3);
		shoeSize.add(4);
		shoeSize.add(5);
		shoeSize.add(6);
		shoeSize.add(7);
		shoeSize.add(8);
		shoeSize.add(9);
		
		System.out.println(shoeSize.size());
		
		for(Integer elements:shoeSize) {
			System.out.println(elements);
		}
		
		Iterator<Integer> itr = shoeSize.iterator();
		
		while(itr.hasNext()) {
			Integer elements =itr.next();
			System.out.println(elements);
		}
	}

	}


