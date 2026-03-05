package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Books;
import com.capg.springboot.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	@PostMapping("/addBook")
	public int addBook(@RequestBody Books book) {
		bookservice.add(book);
		return book.getBookid();
	}
	
	@GetMapping("/allbooks")
	public List<Books> getAllBooks(){
		return bookservice.getAllBooks();
	}
	
	
}
