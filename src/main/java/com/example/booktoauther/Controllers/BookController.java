package com.example.booktoauther.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booktoauther.Entites.Book;
import com.example.booktoauther.Services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/create")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Book> getBooKById(@PathVariable Integer id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping("/all")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
}

