package com.example.booktoauther.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booktoauther.Entites.Auther;
import com.example.booktoauther.Entites.Book;
import com.example.booktoauther.Repositories.AutherRepository;
import com.example.booktoauther.Repositories.BookRepository;

@Service
public class AutherService {
	
	@Autowired
	private AutherRepository autherRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public Auther createAuther(Auther auther) {
		auther.setBook(bookRepository.save(auther.getBook()));
		return autherRepository.save(auther);
	}
	
	
////	// assign an existing  book to auther using id
//	public Auther createAuther(Auther auther) {
//		Optional<Book> optionalj  = bookRepository.findById(auther.getBook().getId());
//		if(optionalj.isPresent()) {
//			auther.setBook(optionalj.get());
//		}else {
//			auther.setBook(null);
//		}
//		return autherRepository.save(auther);
//	}

	
	public Optional<Auther> getAutherById(Integer id) {
		return autherRepository.findById(id);
	}
	
	public List<Auther> getAllAuther() {
		return (List<Auther>) autherRepository.findAll();
	}
	
	public Auther getByname(String name) {
		return autherRepository.findByName(name);
	}

}
