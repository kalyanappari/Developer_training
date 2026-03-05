package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/bookid/{bookid}")
	public Books getBookById(@PathVariable("bookid") int bookid) {
		return bookservice.getBookById(bookid);
	}
	
	@PutMapping("/updatebook")
	public Books update(@RequestBody Books books) {
		bookservice.update(books);
		return books;
	}
	
	@DeleteMapping("/bookid/{bookid}")
	public void deleteBook(@PathVariable("bookid") int bookid) {
		bookservice.delete(bookid);
	}
}
