package com.brianchang.web.services;

import org.springframework.stereotype.Service;

import com.brianchang.web.models.Book;
import com.brianchang.web.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	//returns all books
	public Iterable<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	//find a book by id
	public Book findBookByIndex(Long id) {
		return bookRepo.findOne(id);
	}
	
	//create a book
	public void addBook(Book book) {
		//.add is a built in method for Arraylists to append new info.
		bookRepo.save(book);
	}
	//edit a book/update a book
	public void updateBook(Long id, Book book) {
		bookRepo.save(book);
	}
	
	//delete a book
	public void destroyBook(Long id) {
		bookRepo.delete(id);
	}
}
