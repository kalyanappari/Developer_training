package com.capg.java;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library obj = new Library();
		
		for(int i=0;i<5;i++) {
			
			String st = sc.nextLine();
			
			String arr[] = st.split(";");
			
			Book book = new Book(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]));
			
			obj.addBook(book);
		}
		
		System.out.print("Enter Author name to search for the books: ");
		
		String name = sc.nextLine();
		
		List<Book> booksbygivenAuthor = obj.searchByAuthor(name);
		
		for(Book b : booksbygivenAuthor) {
			System.out.println(b);
		}
		
		System.out.print("Enter the year threshold: ");
		
		int year = sc.nextInt();
		
		List<Book> bookslist = obj.findLatestBooks(year);
		
		for(Book b : bookslist) {
			System.out.println(b);
		}
		
        System.out.print("Enter the year threshold: ");
		
		int year1 = sc.nextInt();

		System.out.print("Enter the min no of pages: ");
		
		int minpages = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter the substring author: ");
		
		String subName = sc.next
		
		
		sc.close();
	}

}
