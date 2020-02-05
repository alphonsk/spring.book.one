package com.george.book.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "books")

public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String bookName;
    @NotBlank
    private String authorName;

    public Book() {
        super();
    }


    public Book(Long id, @NotBlank String bookName, @NotBlank String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
