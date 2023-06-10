package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book> map = new HashMap<>();
        for (Book book:bookSet) {
            map.put(new BookSignature(book.getSignature()),
                    new com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        } return medianPublicationYear(map);
    }
}
