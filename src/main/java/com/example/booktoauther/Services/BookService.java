package com.example.booktoauther.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booktoauther.Entites.Book;
import com.example.booktoauther.Repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Optional<Book> getBookById(Integer id) {
		return bookRepository.findById(id);
	}
	
	public List<Book> getAllBook(){
		return (List<Book>) bookRepository.findAll();
	}
	

}
