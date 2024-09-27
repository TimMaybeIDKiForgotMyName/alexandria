package com.example.alexandria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository repo;

    @Autowired
    public LibraryService(LibraryRepository repo) {
        this.repo = repo;
    }

    public List<Book> getBooks() {
        return repo.library;
    }

    public List<Book> getBooksByAuthor(String author) {
        return repo.getBooksByAuthor(author);
    }
}
