package com.literatura.desafio;

import com.literatura.desafio.main.Main;
import com.literatura.desafio.repository.AuthorRepository;
import com.literatura.desafio.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApiApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookRepository,authorRepository);
		main.app();
	}
}
