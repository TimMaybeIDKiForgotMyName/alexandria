package com.example.alexandria;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibraryRepository {
    public final List<Book> library = new ArrayList<>();

    public LibraryRepository() {
        for (int i = 0; i < 5; i++) {
            library.add(new Book(
                    Faker.instance().book().title(),
                    Faker.instance().book().author(),
                    Faker.instance().book().publisher(),
                    "available"));
        }
    }

    public List<Book> getBooks() {
        return library;
    }

    public List<Book> getBooksByAuthor(String author) {
        return library.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
}