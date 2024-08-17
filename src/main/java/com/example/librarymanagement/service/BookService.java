package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;


    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book getBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }


}