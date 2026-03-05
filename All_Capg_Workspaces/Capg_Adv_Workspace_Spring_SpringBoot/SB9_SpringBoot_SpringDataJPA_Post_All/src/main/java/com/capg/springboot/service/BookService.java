package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.springboot.entity.Books;
import com.capg.springboot.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository booksRepository;
	
	public void add(Books book) {
		booksRepository.save(book);
	}
	
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<>();
		booksRepository.findAll().forEach(b1 -> books.add(b1));
		return books;
	}
	
	public void update(Books books) {
		booksRepository.save(books);
	}

	public void delete(int bookid) {
		booksRepository.deleteById(bookid);
	}
	
	public Books getBookById(int bookid) {
		return booksRepository.findById(bookid).get();
	}
	
}