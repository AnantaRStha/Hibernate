package com.example.mains;

import com.example.entities.AddressEntity;
import com.example.entities.AuthorEntity;
import com.example.repositories.ProductRepository;

public class OneToOneMainApplication {

	public static void main(String[] args) {

//		AddressEntity address = new AddressEntity();
//		address.setAddressline1("3395 Perssimon Dr");
//		address.setCity("Fairfax");
//		address.setState("VA");
//		address.setZipcode(22030d);
//		
//		
//		AuthorEntity author = new AuthorEntity();
//		author.setName("Ananta Raj Shrestha");
//		author.setGender("Male");
//		author.setEmail("jesusananta@gmail.com");
//		author.setAddress(address);

////		AddressEntity address = new AddressEntity();
////		address.setAddressline1("3309 Willow Crescent Dr");
////	address.setCity("Fairfax");
////	address.setState("VA");
////	address.setZipcode(22031d);
////		
////		
////		AuthorEntity author = new AuthorEntity();
////		author.setName("Ananta Shrestha");
////		author.setGender("Male");
////		author.setEmail("nishanluteil@yahoo.com");
////	author.setAddress(address);

//		
		ProductRepository authorRepo = new ProductRepository();
//	authorRepo.save(author);

		System.out.println("Finding the author with id 1");
		AuthorEntity author = authorRepo.getByid(2l);
		System.out.println(author.toString());

		System.out.println("*****************");

		AddressEntity addressOne = author.getAddress();
		addressOne.setAddressline1("3201 Worker Ln");
		addressOne.setCity("Washington");
		addressOne.setState("DC");
		addressOne.setZipcode(22032d);

		author.setAddress(addressOne);
		authorRepo.mergeAddress(addressOne);

	}

}
