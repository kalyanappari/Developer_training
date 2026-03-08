package com.capg.java;

public class Book {
	
	private int id;
	private String author;
	private String title;
	private int yearPublished;
	private int noofPages;
	
	public Book(){
		
	}
	
	public Book(int id, String author, String title, int yearPublished, int noofPages) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.noofPages = noofPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getNoofPages() {
		return noofPages;
	}

	public void setNoofPages(int noofPages) {
		this.noofPages = noofPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", yearPublished=" + yearPublished
				+ ", noofPages=" + noofPages + "]";
	}

}
