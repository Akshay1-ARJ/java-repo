package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.pizza.constant.Type;
import com.xworkz.pizza.dto.ApplicationDTO;
import com.xworkz.pizza.dto.CompanyCEODTO;
import com.xworkz.pizza.dto.DataBaseVenderDTO;
import com.xworkz.pizza.dto.DaugtherDTO;
import com.xworkz.pizza.dto.PalaceDto;

public class PalaceDTORunner {

	public static void main(String[] args) {

		Collection<PalaceDto> palaceDTOs = new ArrayList<PalaceDto>();
		palaceDTOs.add(new PalaceDto("Bengaluru palace", "Bengaluru", "Vadayar", false, 10));
		palaceDTOs.add(new PalaceDto("Mysore Palace", "Mysore", "Vadayar", false, 50));
		palaceDTOs.add(new PalaceDto("Jamakhandi palace", "Jamakhandi", "Patawardhan", false, 500));
		palaceDTOs.add(new PalaceDto("Chalukya palace", "Badami", "Chalukya", true, 1000));
		palaceDTOs.add(new PalaceDto("Shaniwar wada", "Pune", "Peshwa Baji Rao", false, 5021));

		Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("Hospital ", 5.6, true, "google", 2500));
		applicationDTOs.add(new ApplicationDTO("Hotel ", 5.6, true, "facebook", 1500));
		applicationDTOs.add(new ApplicationDTO("Insurence ", 5.6, false, "yahoo", 150));
		applicationDTOs.add(new ApplicationDTO("Enterprice Applications ", 5.6, false, "amezon", 36254));
		applicationDTOs.add(new ApplicationDTO("Web Applications ", 5.6, true, "twitter", 98546));
		applicationDTOs.add(new ApplicationDTO("Mobile Applications ", 5.6, false, "Meta", 2510));

		Collection<DataBaseVenderDTO> dataBaseVenderDTOs = new LinkedList<DataBaseVenderDTO>();
		dataBaseVenderDTOs.add(new DataBaseVenderDTO("Enterprice", "Nikil", Type.HIRARCHICAL_DATABASES, 2.5, 150));
		dataBaseVenderDTOs.add(new DataBaseVenderDTO("Home", "Guru", Type.NETWORK_DATABASES, 3.1, 95));
		dataBaseVenderDTOs.add(new DataBaseVenderDTO("Hospital", "Jeevika", Type.NOSQL_DATABASES, 1.2, 56));
		dataBaseVenderDTOs.add(new DataBaseVenderDTO("State", "Omkar", Type.OBJECT_ORIENTED_DATABASES, 5.5, 280));
		dataBaseVenderDTOs.add(new DataBaseVenderDTO("Country", "Hareesha", Type.SQL, 6.1, 75));

		Collection<CompanyCEODTO> companyCEODTOs = new LinkedList<CompanyCEODTO>();
		companyCEODTOs.add(new CompanyCEODTO("Omkar", "Xworkz", 32, "india", "BE/Btech", true));
		companyCEODTOs.add(new CompanyCEODTO("Akshay", "amazon", 24, "USA", "BE/Btech", false));
		companyCEODTOs.add(new CompanyCEODTO("shubham", "First America", 24, "india", "BE", false));
		companyCEODTOs.add(new CompanyCEODTO("manu", "Signiwins", 24, "india", "BE", false));
		companyCEODTOs.add(new CompanyCEODTO("qwerty", "BNV", 7, "india", "BE/Btech/MCA", false));

		Collection<DaugtherDTO> daugtherDTOs = new LinkedList<DaugtherDTO>();
		daugtherDTOs.add(new DaugtherDTO("Priyanka", 9900775088L, 26, false, true));
		daugtherDTOs.add(new DaugtherDTO("srhadha", 7022537779L, 25, true, true));
		daugtherDTOs.add(new DaugtherDTO("samantha", 9244537206L, 36, false, false));
		daugtherDTOs.add(new DaugtherDTO("Kiara", 7464578945L, 29, true, false));
		daugtherDTOs.add(new DaugtherDTO("keeerthi", 6352145144L, 21, true, false));

//	find all the properties Palace DTO which is Not Destroyed	

		palaceDTOs.stream().filter(ele -> !ele.getDestroyed()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println("Find All ApplicationDTO which is free and Developed By Google");
//	Find All ApplicationDTO which is free and Developed By Google	
		applicationDTOs.stream().filter(ele -> ele.isFree() && "google".contains(ele.getDevelopedBy()))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

		// Find all ApplicaionDTo where version greter than 5 and collect only name
		System.out.println(System.lineSeparator());
		System.out.println(" Find all ApplicaionDTo where version greter than 5 and collect only name");
		applicationDTOs.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele.getName()));
//	find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto

		System.out.println(System.lineSeparator());
		System.out.println("find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto");

//	Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl
		System.out.println(System.lineSeparator());
		System.out.println("Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl");
		dataBaseVenderDTOs.stream().filter(ele -> ele.getLicenceCost() < 100 && ele.getType().equals("SQL"))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

// print all DatabaseVendor Dto Types
		System.out.println(System.lineSeparator());
		System.out.println(" print all DatabaseVendor Dto Types");
		dataBaseVenderDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
// print detiles of companyCEO Dtos Daathoughter Dto
		System.out.println(System.lineSeparator());
		System.out.println("print detiles of companyCEO Dtos Daathoughter Dto");
		companyCEODTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Dauthor dtos");
		daugtherDTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

//	print all Daughtor Dto names Of Company Ceos

		System.out.println(System.lineSeparator());
		System.out.println("//	print all Daughtor Dto names Of Company Ceos");
		daugtherDTOs.stream().map(ele -> ele.getName()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//	Get toatal CompanyDtos where age is Gretherthan 30
		System.out.println(System.lineSeparator());
		System.out.println("	Get toatal CompanyDtos where age is Gretherthan 30");
		companyCEODTOs.stream().filter(ele -> ele.getAges() > 30).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//	print Below formate from CompanyCetdto  father age 7 doughter age 0

		System.out.println(System.lineSeparator());
		System.out.println("//	print Below formate from CompanyCetdto  father age 7 doughter age ");
		daugtherDTOs.stream().filter(ele->ele.getAges()==7).collect(Collectors.toList()).forEach(ele->System.out.println(ele.getAge()==0));
		
	}


	}


