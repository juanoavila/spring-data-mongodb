package com.blog.SpringDataMongodb;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
	
	public Book findByNameBook(String nameBook);
	public List<Book> findByAuthor(String author);

}
