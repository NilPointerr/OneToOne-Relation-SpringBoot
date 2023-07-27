package com.example.booktoauther.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.booktoauther.Entites.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
