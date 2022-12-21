package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompanyNamesRunner {

	public static void main(String[] args) {
		
		String company1="Infosys";
		String company2="KPMG";
		String company3="Microsoft";
		String company4="Salesforce";
		String company5="Sap";
		String company6="Autodesk";
		String company7="Intuit";
		String company8="Splunk";
		String company9="Googale";
		String company10="Surya software";
		String company11="Dell";
		String company12="vraio software";
		String company13="Amazon";
		String company14="Atlassian";
		String company15="Citrix System";
		String company16="EY";
		String company17="CGI inc";
		String company18="intel";
		String company19="mu sigma";
		String company20="wipro";
		
		Collection<String> company = new ArrayList<String>();
		
		company.add(company1);
		company.add(company2);
		company.add(company3);
		company.add(company4);
		company.add(company5);
		company.add(company6);
		company.add(company7);
		company.add(company8);
		company.add(company9);
		company.add(company10);
		company.add(company11);
		company.add(company12);
		company.add(company13);
		company.add(company14);
		company.add(company15);
		company.add(company16);
		company.add(company17);
		company.add(company18);
		company.add(company19);
		company.add(company20);
		
		System.out.println(company.size());
		
		for(String elements :company) {
			System.out.println(elements);
		}
		
		Iterator<String> itr =company.iterator();
		
		while(itr.hasNext()) {
			String elements =itr.next();
			System.out.println(elements);
		}
	}

	}


