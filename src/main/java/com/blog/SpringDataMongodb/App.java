package com.blog.SpringDataMongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	@Autowired
	private BookRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
    
@Override
public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of boks
		repository.save(new Book("Hamlet", "Shakespeare"));
		repository.save(new Book("Othello", "Shakespeare"));
		repository.save(new Book("King Lear", "Shakespeare"));
		repository.save(new Book("The Hobbit", "Tolkien"));

		
		// fetch all books
		System.out.println("Books found with findAll():");
		System.out.println("-------------------------------");
		for (Book book : repository.findAll()) {
			System.out.println(book);
		}
		System.out.println();

		// fetch an individual book
		System.out.println("Book found with findByNameBook('Hamlet'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNameBook("Hamlet"));

		System.out.println("Books found with findByAuthor('Shakespeare'):");
		System.out.println("--------------------------------");
		for (Book book : repository.findByAuthor("Shakespeare")) {
			System.out.println(book);
		}

	}
}
