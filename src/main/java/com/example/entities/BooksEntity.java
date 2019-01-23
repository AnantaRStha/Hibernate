package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "books")
public class BooksEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="author_id")
	private Long author_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "BooksEntity [id=" + id + ", name=" + name + ", genre=" + genre + ", publisher=" + publisher + ", year="
				+ year + "]";
	}
	
	
	
	
	
}
