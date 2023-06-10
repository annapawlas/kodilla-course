package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){

        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Lev Grossman","The Magician King", 2011, "Book Signature The Magician King"));
        books.add(new Book("Richard Powers","The Overstory", 2018, "Book Signature The Overstory"));
        books.add(new Book("Markus Zusak","Bridge of Clay", 2018, "Book Signature Bridge of Clay"));
        books.add(new Book("N. K. Jemisin","The City We Became", 2020, "Book Signature The City We Became"));
        books.add(new Book("Leigh Bardugo","Hell Bent: A Novel", 2023, "Book Signature Hell Bent: A Novel"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assertions.assertEquals(2018, median);
    }
}
