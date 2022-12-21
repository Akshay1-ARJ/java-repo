package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {
		

		String animal1="AKSHAY";
		String animal2="SHUBHAM";
		String animal3="MANU S P";
		String animal4="NATARAJ";
		String animal5="SANJAY";
		String animal6="GANI";
		String animal7="DARSHAN";
		String animal8="RAVITEJA";
		String animal9="SRISHAM";
		String animal10="VINAY";
		
		Collection<String> animals= new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		
		System.out.println(animals.size());
		
		for(String elements:animals) {
			System.out.println(elements);
		}
		Iterator<String> itr=animals.iterator();
		while(itr.hasNext()) {
			
			String elements=itr.next();
			System.out.println(elements);
		}
		
	}

	}


