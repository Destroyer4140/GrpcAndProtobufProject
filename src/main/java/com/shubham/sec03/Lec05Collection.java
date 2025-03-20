package com.shubham.sec03;

import com.shubham.models.sec03.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;

public class Lec05Collection {

    public static final Logger log = LoggerFactory.getLogger(Lec05Collection.class);

    public static void main(String[] args) {


        var book1 = Book.newBuilder()
                .setTitle("The Great Gatsby")
                .setAuthor("F. Scott Fitzgerald")
                .setPublicationYear(1925)
                .build();
        var book2 = Book.newBuilder()
                .setTitle("To Kill a Mockingbird")
                .setAuthor("Harper Lee")
                .setPublicationYear(1960)
                .build();
        var book3 = Book.newBuilder()
                .setTitle("1984")
                .setAuthor("George Orwell")
                .setPublicationYear(1949)
                .build();

        var library = com.shubham.models.sec03.Library.newBuilder()
                .setName("My Library")
//                .addBooks(book1)
//                .addBooks(book2)
//                .addBooks(book3)
                .addAllBooks(Set.of(book1, book2, book3))
                // Set.of(book1, book2, book3) for unique item, List.of(book1, book2, book3) for general item
                .build();

        log.info("{}", library);
    }
}
