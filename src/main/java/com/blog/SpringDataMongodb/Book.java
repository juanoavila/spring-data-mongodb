package com.blog.SpringDataMongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="masterbook")
public class Book {
	
	@Id
	public String id;
	
	public String nameBook;
	
	public String author;

	public Book(String nameBook, String author) {
		super();
		this.nameBook = nameBook;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nameBook=" 
			+ nameBook + ", author=" + author + "]";
	}

}
