package com.example.mains;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.AddressEntity;
import com.example.entities.AuthorEntity;
import com.example.entities.BooksEntity;
import com.example.repositories.ProductRepository;

public class OneToManyApplication {

	public static void main(String[] args) {
//		AuthorEntity author = new AuthorEntity();
//		author.setName("abc");
//		author.setEmail("abc.gmail.com");
//		author.setGender("male");
//		
//		
//		AddressEntity add = new AddressEntity();
//		add.setAddressline1("100 Toolate ln");
//		add.setAddressline2("apt -12");
//		add.setCity("FallsChurch");
//		add.setState("VA");
//		add.setZipcode(22014d);
//		
//		author.setAddress(add);
//		
		
		List<BooksEntity> books = new ArrayList<BooksEntity>();
		BooksEntity b1 = new BooksEntity();
		b1.setName("WanderOff");
		b1.setGenre("Physcology");
		b1.setPublisher("HolyImmanaual");
		b1.setYear(2018);
		
		BooksEntity b2 = new BooksEntity();
		b2.setName("harryPotter");
		b2.setGenre("Fiction");
		b2.setPublisher("Non");
		b2.setYear(2002);

		books.add(b1);
		books.add(b2);
		
		ProductRepository bookRepo = new ProductRepository();
		AuthorEntity author = bookRepo.getByid(3l);
		author.setBooks(books);
		bookRepo.updateAuthor(author);
	}

}
