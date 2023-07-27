package com.example.booktoauther.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booktoauther.Entites.Auther;
import com.example.booktoauther.Services.AutherService;

@RestController
@RequestMapping("/auther")
public class AutherConteroller {

	@Autowired
	private AutherService autherService;
		
	@PostMapping("/create")
	public Auther createAuther(@RequestBody Auther auther) {
		return autherService.createAuther(auther);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Auther> getAutherById(@PathVariable Integer id) {
		return autherService.getAutherById(id);
	}
	
	@GetMapping("/all")
	public List<Auther> getAllAuther(){
		return autherService.getAllAuther();
	}
	
	@GetMapping("/search/{name}")
	public ResponseEntity<Auther> getByName(@PathVariable String name) {
		return ResponseEntity.ok(autherService.getByname(name));
	}
	}
