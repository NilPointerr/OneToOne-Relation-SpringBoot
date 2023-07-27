package com.example.booktoauther.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.booktoauther.Entites.Auther;

public interface AutherRepository extends CrudRepository<Auther, Integer>{
	public Auther findByName(String name);

}
