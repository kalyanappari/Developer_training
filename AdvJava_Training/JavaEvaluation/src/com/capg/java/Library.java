package com.capg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	
	private List<Book> books = new ArrayList<>();
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> findLatestBooks(int yearThreshold){
		
		List<Book> list = books.stream()
				               .filter(obj -> obj.getYearPublished() > yearThreshold)
				               .collect(Collectors.toList());
		
		return list;
	}
	
	public List<Book> findBooksByComplexCritertia(int year,int minPages,String authorsubstring){
		
		List<Book> list = books.stream()
				               .filter(obj -> obj.getYearPublished() > year)
				               .filter(obj -> obj.getNoofPages() >= minPages)
				               .filter(obj -> obj.getAuthor().toLowerCase().contains(authorsubstring.toLowerCase()))
				               .collect(Collectors.toList());
		return list;
	}

	public List<Book> searchByAuthor(String name) {
		
		return books.stream()
				    .filter(obj -> obj.getAuthor().equals(name))
				    .collect(Collectors.toList());
		
		
	}
	
	
	
}
